package Character_package;

import java.awt.Graphics;

public class Enemy extends Character{

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
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




}
