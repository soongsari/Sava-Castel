package Character_package;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
		
		path = "img/monster.jpg";

		try {
			this.image = ImageIO.read(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public void Paint(Graphics g) {

		g.drawImage(image, x, y, 30,30, this);
//		g.setColor(Color.black);
//		g.fillRect(x, y, 30, 30);
//		g.setColor(Color.white);
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
