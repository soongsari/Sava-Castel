package GUI_package;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;

import Character_package.Character;
import Character_package.Enemy;
import Character_package.Hero;

public class Game_Window extends Canvas implements Runnable {

	static ArrayList<Hero> hero_list = new ArrayList<>();
	Move_enemy m_e;
	
	int num = 0, weight, height;

	public Game_Window(int weight, int height) {

		m_e = new Move_enemy(10);
		
		this.weight = weight;
		this.height = height;

		this.setBackground(Color.white);
		this.setSize(weight, height);

		Thread th = new Thread(this);
		th.start();
	}

	public void GameStart() {

		for (int i = 0; i < hero_list.size(); i++) {
			
			if (hero_list.get(i).isDie()) { // 죽었을때
				hero_list.remove(i);
				continue;
			}
			
//			for (int j = 0; j < enemy_list.size(); j++) {
//
//				if (hero_list.get(i).Meet(enemy_list.get(j))) { //히어로와 적이 만났다!
//					enemy_list.get(j).Damaged(hero_list.get(i).getStr()); // 적공격 받음
//					hero_list.get(i).Damaged(enemy_list.get(j).getStr()); // 아군공격 받음	
//					
//					if (enemy_list.get(j).isDie()) {
//						enemy_list.remove(j);
//					}
//					
//				}
//			}

		}

	}


	public void paint(Graphics g) {
		
		m_e.drop();
		m_e.draw(g);
		
		g.fillRect(0, 0, weight, height);

		ArrayList<Character> temp_array = new ArrayList<>();
		//temp_array.addAll(enemy_list);
		temp_array.addAll(hero_list);

		for (int i = 0; i < temp_array.size(); i++) {
			Character temp = temp_array.get(i);
			temp.Paint(g);
			temp.Move();
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


			

			GameStart();

			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
