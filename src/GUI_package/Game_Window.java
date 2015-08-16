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

	static ArrayList<Enemy> enemy_list = new ArrayList<>();
	static ArrayList<Hero> hero_list = new ArrayList<>();

	int num = 0, weight, height;

	public Game_Window(int weight, int height) {

		this.weight = weight;
		this.height = height;

		this.setBackground(Color.white);
		this.setSize(weight, height);

		Thread th = new Thread(this);
		th.start();
	}

	public void GameStart() {

		// while(true){
		for (int i = 0; i < hero_list.size(); i++) {
			Hero tempHero = hero_list.get(i);
			boolean flag = false;

			if (tempHero.isDie() == true) { // 죽었을때
				hero_list.remove(i);
				continue;

			}
			
			for (int j = 0; j < enemy_list.size(); j++) {

				if (tempHero.Meet(enemy_list.get(j))) {
					enemy_list.get(j).Damaged(tempHero.getStr()); // 적공격
					tempHero.Damaged(enemy_list.get(j).getStr()); // 아군공격 받음

					flag = true;

					if (enemy_list.get(j).isDie()) {
						enemy_list.remove(j);
						flag = false;
					}
					
		
				} else {
					enemy_list.get(j).Move();
				}
			}

			// 공격할 상대가 없으면 이동
			if (flag == false) {
			//	tempHero.Move();
			}
		}

	}

	// }

	public void paint(Graphics g) {

		g.fillRect(0, 0, weight, height);

		ArrayList<Character> temp_array = new ArrayList<>();
		temp_array.addAll(enemy_list);
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

			if (num % 200 == 0) {
				Enemy ene = new Enemy();
				enemy_list.add(ene);
			}

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
