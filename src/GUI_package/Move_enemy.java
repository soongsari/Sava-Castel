package GUI_package;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

import Character_package.Enemy;

public class Move_enemy {
	int enemy_num;
	static ArrayList<Enemy> enemy_list = new ArrayList<>();
	
	public Move_enemy(int num){
		enemy_num=num;
		
		made();
	}
	
	void made(){
		for(int i=0;i<enemy_num;i++){
			Enemy e = new Enemy();
			enemy_list.add(e);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	void drop(){
		for(int i=0;i<enemy_num;i++){
			Enemy temp = enemy_list.get(i);
			temp.Move();
		}
	}
	
	void draw(Graphics g){
		
		for(int i=0;i<enemy_num;i++){
			enemy_list.get(i).Paint(g);

		}
	}
	
	
}
