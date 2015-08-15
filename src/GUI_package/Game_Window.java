package GUI_package;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import Character_package.Character;

public class Game_Window extends Canvas implements Runnable{
	
	ArrayList<Character> chr_list = new ArrayList<>();

	public Game_Window(int weight, int height){
		this.setBackground(Color.white);
		this.setSize(weight,height);
		
		Thread th = new Thread(this);
		th.start();
	}

	public void chr_add(Character chr){
		chr_list.add(chr);
	}
	
	public void chr_remove(int index){
		chr_list.remove(index);
	}
	
	public void paint(Graphics g){
		
		for(int i=0;i<chr_list.size();i++)
		{
			Character temp = chr_list.get(i);
			temp.Move();
			temp.Paint(g);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			repaint();
			
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
