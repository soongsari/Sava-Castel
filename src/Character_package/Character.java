package Character_package;

import java.util.ArrayList;

public abstract class Character {
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x,y;
	boolean type;
	int image;
	
	public void Attack(){
		
	}
	
	public abstract void Move(ArrayList chrs);
	public abstract void Damaged(int str);
	public abstract void Meet();
	public abstract void Paint();
	
	
	public boolean isDie(){
		return die;
	}
}
