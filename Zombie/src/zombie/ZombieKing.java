package zombie;

public class ZombieKing  extends Units{

	ZombieKing() {
		super(20,15,20,300,"좀비킹",15);
		
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
		unit.setHp(unit.getHp()-damage);
		System.out.printf("%s가 %s를 공격 %d의 데미지를 입혔습니다.\n",this.getName(),unit.getName(),damage);
	}

}
