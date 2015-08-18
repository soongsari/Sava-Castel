package GUI_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;

import Character_package.Character;
import Character_package.Enemy;
import Character_package.Hero;

public class Game_Window extends Panel implements Runnable {

	static ArrayList<Character> enemy_list = new ArrayList<>();
	static ArrayList<Character> hero_list = new ArrayList<>();

	int num = 0, weight, height;

	public Game_Window(int weight, int height) {

		this.weight = weight;
		this.height = height;

		this.setBackground(Color.white);
		this.setSize(weight, height);

		Thread th = new Thread(this);
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

	}


	public void paint(Graphics g) {

		g.fillRect(0, 0, weight, height);


		for (int i = 0; i < enemy_list.size(); i++) {
			Character temp = enemy_list.get(i);
			temp.Paint(g);
			temp.Move(hero_list);
		}
		
		for (int i = 0; i < hero_list.size(); i++) {
			Character temp = hero_list.get(i);
			temp.Paint(g);
			temp.Move(enemy_list);
		}
	}

	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			num++;
			repaint();

			if (num % 100 == 0) {
				Enemy ene = new Enemy();
				enemy_list.add(ene);
			}

			Check_Die();

			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
