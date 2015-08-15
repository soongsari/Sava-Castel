package Character_package;

import java.util.ArrayList;


public class Hero extends Character{
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x=300,y=300;
	boolean type;
	int image;
	
	public Hero(int number){
		if(number==1){
			this.HP=30;
			this.SPEED=1;
			this.STR = 1;
			this.die = false;
			this.type = true;		//true 는 아군 
			this.image = 1;
		}
	}
	
	

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Move(ArrayList enemies) {		// 오른쪽에서 왼쪽으로 이동
		x = x - SPEED;
		
		//적군들 위치 및 생사 판단
		for(int i=0; i<enemies.size(); i++){
			Enemy tempEnemy = (Enemy)enemies.get(i);
			
			if(tempEnemy.isDie()==true){		//적군 죽음
				
			} else {
				
			}
		}
		
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
