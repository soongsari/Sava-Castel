package Character_package;

import java.util.ArrayList;


public class Castle extends Character{
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x,y;
	boolean type;
	int image;
	
	public Castle(){
		this.HP=1000;
		this.SPEED=0;
		this.STR = 0;
		this.die = false;
		
		//��ġ
		this.x = 0;
		this.y = 10;
		this.type = true;		//true �� �Ʊ� 
		this.image = 1;
	}

	@Override
	public void Attack() {
		
	}

	@Override
	public void Move(ArrayList enemies) {	//�Ķ���� �ʿ� ������ �����ε� �ʿ�

		
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
	public void Paint() {
		// TODO Auto-generated method stub
		
	}



}
