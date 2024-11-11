package zombie;

public class Hero extends Units{
	Hero(String name,int location){
		super(30,3,10,150,name,location);
	}
	public void recovery() {
			setHp(getHp() + 100);
			System.out.println("체력 회복해서" + getHp() + "이 되었습니다");
	}
	@Override
	void attack(Units unit) {
		// TODO Auto-generated method stub
		
	}
}
