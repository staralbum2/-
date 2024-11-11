package zombie;

import java.util.Random;

abstract public class Units {
	private int power;
	private int defense;
	private int critical;
	private int hp;
	private Random ran;
	private int location;
	private String name;
	// 리커 카운트를 5제한두고
	// 휴식 선택지를 고르면 리커카운트 +1 , 한지역에서 쉴수있는 제한을 1회 카운터로 두고
	// if rest cnt == 0일때만 1개증가하고 휴식 가능한걸로
	// if restCnt == 1 일땐 메뉴2번 출력
	// 3번선택지로 저장을
	// 4번에 종료를 넣고
	// 5번은 로드
	Units(int power,int defense,int critical,int hp,String name,int location){
		this.power = power;
		this.defense = defense;
		this.critical = critical;
		this.hp = hp;
		this.name = name;
		ran = new Random();
		this.location= location;
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
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getName() {
		return this.name;
	}
	public void move() {
		if(location <=10) location++;
		System.out.println("오른쪽으로 이동. 현재 위치 : "+ location);
	}
	abstract void attack(Units unit);	
	
}
