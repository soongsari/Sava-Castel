package Character_package;

import java.awt.Graphics;

public abstract class Character {
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x,y;
	boolean type;
	int image;
	
	public abstract void Attack();
	public abstract void Move();
	public abstract void Damaged(int str);
	public abstract void Meet();
	public abstract void Paint(Graphics g);
	
	public boolean isDie(){
		return die;
	}
}
