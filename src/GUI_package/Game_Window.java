package GUI_package;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;

import Character_package.Castle;
import Character_package.Character;
import Character_package.Enemy;

public class Game_Window extends Canvas implements Runnable {

	static ArrayList<Character> enemy_list = new ArrayList<>();
	static ArrayList<Character> hero_list = new ArrayList<>();
	static ArrayList<Character> castle_list = new ArrayList<>();
	Thread th;
	int num = 0, weight, height;

	public Game_Window(int weight, int height) {

		this.weight = weight;
		this.height = height;

		this.setBackground(Color.white);
		this.setSize(weight, height);
		
		Castle cas = new Castle();
		castle_list.add(cas);

		th = new Thread(this);
		th.start();
	}
	


	public void Check_Die() {

		for (int i = 0; i < enemy_list.size(); i++) {
			if(enemy_list.get(i).isDie()){
				enemy_list.remove(i);
			}
		}
		
		for (int i = 0; i < hero_list.size(); i++) {
			if(hero_list.get(i).isDie()){
				hero_list.remove(i);
			}
		}
		
		for (int i = 0; i < castle_list.size(); i++) {
			if(castle_list.get(i).isDie()){
				castle_list.remove(i);
				GameOver(this.getGraphics());
				th.stop();
			}
		}

	}
	
	private void GameOver(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(0, 0, weight, height);
		g.setColor(Color.BLACK);
		g.drawString("GameOver", weight/2, height/2);
	}



	public void paint(Graphics g) {

		Image buff = createImage(weight,height);
		Graphics t = buff.getGraphics();
		
		t.fillRect(0, 0, weight, height);
		castle_list.get(0).Paint(t);

		for (int i = 0; i < enemy_list.size(); i++) {
			Character temp = enemy_list.get(i);
			temp.Paint(t);
			temp.Move(hero_list);
		}
		
		for (int i = 0; i < hero_list.size(); i++) {
			Character temp = hero_list.get(i);
			temp.Paint(t);
			temp.Move(enemy_list);
		}
		
		castle_list.get(0).Meet(enemy_list);
		g.drawImage(buff, 0, 0, null);
	}

	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Check_Die();
			
			num++;
			repaint();

			if (num % 100 == 0) {
				Enemy ene = new Enemy();
				enemy_list.add(ene);
			}

			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
