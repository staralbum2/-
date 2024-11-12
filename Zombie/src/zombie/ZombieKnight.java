package zombie;

public class ZombieKnight extends Units {
	

	ZombieKnight() {
		super(15,15,30,200,"좀비기사",10);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack(Units unit) {
		int damage = this.getPower();
		int cri = ran.nextInt(100)+1;
		int criticalHit = this.getCritical();
		if(cri <= criticalHit ) { 
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
