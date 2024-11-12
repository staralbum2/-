package zombie;

abstract public class Item {
	private int power;
	private int defence;
	private int critical;
	private String name;
	Item(int power,int critical,String name){
		this.power = power;
		this.critical=critical;
		this.name=name;
	}
	Item(int defence,String name){
		this.defence = defence;
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getCritical() {
		return this.critical;
	}
	public int getDefence() {
		return this.defence;
	}
	
	
}
