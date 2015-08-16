package Character_package;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import GUI_package.Game_Window;

public class Enemy extends Character implements Runnable{

	public Enemy(){

		this.x = 0;
		this.y = 300;
		this.HP=10;
		this.SPEED=1;
		this.STR = 1;
		this.die = false;
		this.type = true;		//true 는 아군 
		//this.image = 1;
	}

	@Override
	public void Attack() {
		
	}

	public void Move() {		//왼쪽에서 오른쪽으로 이동

		x = x + SPEED;
	}


	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, 30, 30);
		g.setColor(Color.white);
		g.drawRect(x, y, 30, 30);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDie() {
		// TODO Auto-generated method stub
		return false;
	}
}
