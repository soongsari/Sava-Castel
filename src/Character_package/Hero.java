package Character_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Hero extends Character{
	

	public Hero(int number){
		if(number==1){
			
			this.x = 550;
			this.y = 300;
			this.HP=100;
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
	public void Move(ArrayList<Character> list) {		// 오른쪽에서 왼쪽으로 이동

		int ck=0;
		
		for(int i=0;i<list.size();i++){
			if(Math.abs(this.x-list.get(i).x)<=20){
				ck=1;
				list.get(i).Damaged(STR);
				break;
			}
		}
		
		if(ck==0){
			x = x - SPEED;
		}

	}


	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stu
		
		
		g.setColor(Color.yellow);
		g.fillRect(x, y, 30, 30);
		g.setColor(Color.black);
		g.drawRect(x, y, 30, 30);
	}
	
	
    public void update(Graphics g) {
    	Paint(g);
    }

}
