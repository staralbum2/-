package zombie;

abstract public class Item {
	private int power;
	private int defence;
	private int hp;
	
	Item(int power){
		this.power = power;	
	}
	Item(int defence,int hp){
		this.hp=hp;
		this.defence = defence;
	}
}
