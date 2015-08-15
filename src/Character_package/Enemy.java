package Character_package;

<<<<<<< HEAD
import java.awt.Graphics;
=======
import java.util.ArrayList;
>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875

import GUI_package.Game_Window;

public class Enemy extends Character implements Runnable{
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x=0,y=300;
	boolean type;
	int image;
	
	
	Game_Window g_w;
	
	
	public Enemy(){
		g_w = new Game_Window();
	}

	@Override
	public void Attack() {
		
	}

	@Override
<<<<<<< HEAD
	public void Move() {
		// TODO Auto-generated method stub
=======
	public void Move(ArrayList heroes) {		//왼쪽에서 오른쪽으로 이동
>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875
		x = x + SPEED;
	}

	@Override
	public void Damaged(int str) {
		HP = HP - str;
		if(HP<=0){
			die = true;
		}
	}

	@Override
	public void Meet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}
<<<<<<< HEAD


=======
	
	
	public void run() {
		g_w.Add(new Enemy());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875


}
