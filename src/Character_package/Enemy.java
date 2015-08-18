package Character_package;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import GUI_package.Game_Window;

public class Enemy extends Character{

	public Enemy(){

		this.x = 0;
		this.y = 300;
		this.HP=100;
		this.SPEED=1;
		this.STR = 1;
		this.die = false;
		this.type = false;		//true 는 아군 

		//this.image = 1;
	}

	@Override
	public void Attack() {
		
	}

	public void Move(ArrayList<Character> list) {		//왼쪽에서 오른쪽으로 이동

		int ck=0;
		
		for(int i=0;i<list.size();i++){
			if(Math.abs(this.x-list.get(i).x)<=20){
				ck=1;
				list.get(i).Damaged(STR);

				break;
			}
		}
		
		if(ck==0){
			x = x + SPEED;
		}
		}
	
	@Override
	public boolean Meet(Character chr) {
		// TODO Auto-generated method stub
		return super.Meet(chr);
		
	}


	@Override
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, 30, 30);
		g.setColor(Color.white);
		g.drawRect(x, y, 30, 30);
		
	}
    public void update(Graphics g) {
    	Paint(g);
    }

}
