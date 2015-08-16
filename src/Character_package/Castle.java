package Character_package;

import java.awt.Graphics;
import java.util.ArrayList;

public class Castle extends Character{
	

	public Castle(){
		
		this.HP=1000;
		this.SPEED=0;
		this.STR = 0;
		this.die = false;
		
		//위치
		this.x = 0;
		this.y = 10;
		this.type = true;		//true 는 아군 
		this.image = 1;
	}

	@Override
	public void Attack() {
		
	}


	@Override
	public void Damaged(int str) {
		HP = HP - str;
		if(HP<=0){
			die = true;
		}

	}

	@Override
	public boolean Meet(Character chr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

}
