package Character_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Hero extends Character{
	

	public Hero(int number){
		if(number==1){
			
			this.x = 550;
			this.y = 300;
			this.HP=10;
			this.SPEED=1;
			this.STR = 1;
			this.die = false;
			this.type = true;		//true �� �Ʊ� 
			this.image = 1;
		}
	}
	
	

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Move() {		// �����ʿ��� �������� �̵�
		x = x - SPEED;
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
