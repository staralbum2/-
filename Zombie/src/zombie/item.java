package zombie;

abstract public class item {
	private int power;
	private int defence;
	private int hp;
	
	item(int power){
		this.power = power;	
	}
	item(int defence,int hp){
		this.hp=hp;
		this.defence = defence;
	}
}
