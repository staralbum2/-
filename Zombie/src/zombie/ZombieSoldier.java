package zombie;

public class ZombieSoldier extends Units {
	public ZombieSoldier(int ran) {
		super(12,-2,3,150,"좀비병사",ran);
	}

	@Override
	void attack(Units unit) {
		int damage = this.getPower();
		int cri = ran.nextInt(100)+1;
		int criticalHit = this.getCritical();
		if(cri <= criticalHit) { 
			damage*=2;
			System.out.println("크리티컬 히트!");
		}
		damage -= unit.getDefense();
		if(damage < 0)
			damage = 0;
		unit.setHp(unit.getHp()-damage);
		System.out.printf("%s가 %s를 공격 %d의 데미지를 입혔습니다.\n",this.getName(),unit.getName(),damage);
	}
}
