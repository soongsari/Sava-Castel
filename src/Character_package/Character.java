package Character_package;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Character {

	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x, y;
	boolean type;
	int image;
	boolean isMeet;

	
	public void Stop(){
		SPEED=0;
	}
	
	public abstract void Attack();

	public abstract void Move(ArrayList<Character> list);
	
	public boolean getType(){
		return type;
	}

	public boolean Meet(Character chr) {

		isMeet = false;

		if (Math.abs(chr.getX() - x) <= 20) { // Enemy의 X+1 값이 Hero의 X 값과 같으면
			isMeet = true;
		}
		return isMeet;
	}

	public abstract void Paint(Graphics g);

	public void Damaged(int str) {

		HP = HP - str;

		if (HP <= 0) {
			die = true;
		}
		
	}

	public int getX() {
		return x;
	}

	public boolean isDie() {
		return die;
	}

	public int getStr() {
		return STR;
	}
}
