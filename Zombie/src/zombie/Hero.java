package zombie;

import java.util.Random;

public class Hero extends Units {
	private Item inventori[] = new Item[10];
	private Item equipment[] = new Item[2];
	
	
	Hero(String name, int location) {
		super(30, 3, 10, 150, name, location);
		equipment[0]=new OldSword();
		equipment[1]=new OldArmor();
	}

	public void recovery() {
		setHp(getHp() + 50);
		System.out.println("체력 회복해서" + getHp() + "이 되었습니다");
	}

	public Item[] getInventori() {
		return this.inventori;
	}
	public Item[] getEquipment() {
		return this.equipment;
	}

	@Override
	public String toString() {
		String info = "";
		for (int i = 0; i < inventori.length; i++) {
			if (inventori[i] == null)
				info += String.format("%d) no item\n", i + 1);
			else
				info += String.format("%d) %s\n", i + 1, inventori[i].getName());
		}
		return info;
	}

	@Override
	void attack(Units enemy) {
		
		int damage = this.getPower() + equipment[0].getPower();
		int cri = ran.nextInt(100)+1;
		int criticalHit = this.getCritical()+equipment[0].getCritical();
		if(cri <= criticalHit ) { 
			damage*=2;
			System.out.println("크리티컬 히트!");
		}
		damage -= enemy.getDefense();
		if(damage < 0)
			damage = 0;
		enemy.setHp(enemy.getHp()-damage);
		System.out.printf("%s가 %s를 공격 %d의 데미지를 입혔습니다.\n",this.getName(),enemy.getName(),damage);
		System.out.println("용사의 남은 체력" + this.getHp());
		System.out.printf("%s의 남은 체력%d\n",enemy.getName(),enemy.getHp());	
		
	}

}
