package zombie;

abstract public class Item {
	private int power;
	private int defence;
	private int critical;
	Item(int power,int critical){
		this.power = power;
		this.critical=critical;
	}
	Item(int defence){
		this.defence = defence;
	}
}
