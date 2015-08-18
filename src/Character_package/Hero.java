package Character_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Hero extends Character{
	


	public Hero(int number){
		
		this.x = 550;
		this.y = 300;
		this.die = false;
		this.type = true;		//true 는 아군 
		
		if(number==1){
			
			this.HP=100;
			this.SPEED=1;
			this.STR = 1;
			path = "img/panda.jpg";
		}
		else if(number==2){
			this.HP=50;
			this.SPEED=2;
			this.STR = 3;
			path = "img/bird.jpg";
		}
		
		
		try {
			this.image = ImageIO.read(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void Move(ArrayList<Character> list) {		// 오른쪽에서 왼쪽으로 이동

		int ck=0;
		
		if(this.x<=20){
			ck=1;
		}

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
		g.drawImage(image, x, y, 30,30, this);
		
//		g.setColor(Color.yellow);
//		g.fillRect(x, y, 30, 30);
//		g.setColor(Color.black);
//		g.drawRect(x, y, 30, 30);
	}
	
	
    public void update(Graphics g) {
    	Paint(g);
    }



	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}

}
