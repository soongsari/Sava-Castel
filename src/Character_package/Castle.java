package Character_package;

<<<<<<< HEAD
import java.awt.Graphics;
=======
import java.util.ArrayList;

>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875

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
	public void Move(ArrayList enemies) {	//파라미터 필요 없으니 오버로딩 필요

		
	}

	@Override
	public void Damaged(int str) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		
=======
		HP = HP - str;
		if(HP<=0){
			die = true;
		}
>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875
	}

	@Override
	public void Meet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

<<<<<<< HEAD
=======

>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875

}
