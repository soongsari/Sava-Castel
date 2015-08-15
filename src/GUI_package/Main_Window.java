package GUI_package;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Main_Window extends JFrame{
	
	int weight=700, height=500;
	double game_ratio=0.7, control_ratio=0.3;

	public Main_Window(){
		
		Game_Window game_win = new Game_Window(weight,(int)(height*game_ratio));
		Control_Window control_win = new Control_Window(weight,(int)(height*control_ratio));
		
		this.setLayout(new FlowLayout());
		this.add(game_win);
		this.add(control_win);
		
		this.setSize(weight, height);
		this.setVisible(true);
	}
}
