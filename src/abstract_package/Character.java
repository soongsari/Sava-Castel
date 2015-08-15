package abstract_package;

public abstract class Character {
	
	int HP;
	int SPEED;
	int STR;
	boolean die;
	int x,y;
	boolean type;
	int image;
	
	public abstract void Attack();
	public abstract void Move();
	public abstract void Damaged();
	public abstract void Meet();
	public abstract void Paint();
}
