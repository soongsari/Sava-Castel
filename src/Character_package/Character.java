package Character_package;

import java.awt.Graphics;

public abstract class Character{
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x,y;
	boolean type;
	int image;
	
	public abstract void Attack();
	public abstract void Move();
	
	public boolean Meet(Character chr){
		
		
		boolean isMeet = false;
		if (chr.isDie() == true) { // ���� ����
			
		} else {
			if (Math.abs(chr.getX()-x) <= 20) { // Enemy�� X+1 ���� Hero�� X ���� ������
				isMeet = true;
			}
		}
		return isMeet;
	}
	
	
	public abstract void Paint(Graphics g);
	
	
	public void Damaged(int str){
		
		HP = HP - str;
		
		if(HP<=0){
			die = true;
		}
	}
	
	
	public int getX(){
		return x;
	}
	
	public boolean isDie(){
		return die;
	}
	
	public int getStr(){
		return STR;
	}
}
