package zombie;

import java.util.Random;

abstract public class Units {
	private int power;
	private int defense;
	private int critical;
	private int hp;
	private Random ran;
	
	
	
	Units(int power,int defense,int critical,int hp){
		this.power = power;
		this.defense = defense;
		this.critical = critical;
		this.hp = hp;
		ran = new Random();
	}
	
	public int getPower() {
		return this.power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getDefense() {
		return this.defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getCritical() {
		return this.critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	abstract void attack(Units unit);	
	
}
