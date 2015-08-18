package Character_package;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Castle extends Character{
	

	public Castle(){
		
		this.HP=400;
		this.SPEED=0;
		this.STR = 0;
		this.die = false;
		
		this.x = 500;
		this.y = 150;
		this.type = true;		//true ´Â ¾Æ±º 
		
		path = "img/castle.png";
		
		try {
			this.image = ImageIO.read(new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	public void Paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, x, y, 200,200, this);
		
	}

	@Override
	public void Move(ArrayList<Character> list) {
		// TODO Auto-generated method stub

		for(int i=0;i<list.size();i++){
			if(Math.abs(this.x-list.get(i).x)<=20){
				this.Damaged(list.get(i).getStr());
				break;
			}
		}

	}

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}

}
