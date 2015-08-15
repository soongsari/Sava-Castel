package GUI_package;

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

}
