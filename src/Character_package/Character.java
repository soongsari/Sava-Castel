package Character_package;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public abstract class Character implements ImageObserver{

	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x, y;
	Image image;
	String path;
	boolean type;
	boolean isMeet;

	public abstract void Move(ArrayList<Character> list);

	public void Meet(ArrayList<Character> list) {

		
		for(int i=0;i<list.size();i++){
			if (list.get(i).x>this.x+50) { // Enemy의 X+1 값이 Hero의 X 값과 같으면
				list.get(i).SPEED=0;
				this.Damaged(list.get(i).getStr());
			}
		}
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
