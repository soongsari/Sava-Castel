package GUI_package;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import Character_package.Character;

<<<<<<< HEAD
public class Game_Window extends Canvas implements Runnable{
	
	ArrayList<Character> chr_list = new ArrayList<>();
=======
import java.util.ArrayList;

import Character_package.Enemy;
import Character_package.Hero;

public class Game_Window {
	ArrayList<Hero> heroes = new ArrayList<Hero>();
	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	
	Thread createEnemy = new Thread(new Enemy());
	
	
	public Game_Window(){
		
		createEnemy.start();
		
	}
	
	
	public void GameStart(){
		while(true){
			for(int i=0; i<heroes.size(); i++){
				Hero tempHero = heroes.get(i);
				
				//�׾����� ��Ҵ��� Ȯ��
				if(tempHero.isDie()==true){		//�׾�����
					
					heroes.remove(i);
					break;
					
				} else {						//�������
					tempHero.Move(enemies);		//�̵�, ����
					tempHero.Attack();
				}
			}
		}
	}
	
	
	//Enemy�� Enemies�� �߰� -- ����Ʈ ����� 10 �̻��̸� ������ ����
	public void Add(Enemy e){
		if(enemies.size()>=10){
			createEnemy.stop();
		} else {
			enemies.add(e);
		}
	}
	
	//������� ��
	public void Drop(Enemy e){
		enemies.remove(e);
	}
>>>>>>> 5ebdeae13c806a5306e34c31d30916d538c0e875

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
