package GUI_package;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Character_package.Hero;

public class Control_Window extends Panel implements ActionListener{
	
	JButton bnt1 = new JButton("ÆÇ´Ù");
	JButton bnt2 = new JButton("»õ");
	
	public Control_Window(int weight, int height){
		this.setLocation(0, 350);
		this.setSize(weight,height);
		this.setBackground(Color.black);
		this.add(bnt1);
		bnt1.addActionListener(this);
		this.add(bnt2);
		bnt2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bnt1){
			Hero c = new Hero(1);
			Game_Window.hero_list.add(c);
			
		}	
		else if(e.getSource()==bnt2){
			Hero c = new Hero(2);
			Game_Window.hero_list.add(c);
			
		}
	}
}
