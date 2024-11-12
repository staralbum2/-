package zombie;

public class Hero extends Units {
	private Item inventori[] = new Item[10];

	Hero(String name, int location) {
		super(30, 3, 10, 150, name, location);
	}

	public void recovery() {
		setHp(getHp() + 50);
		System.out.println("체력 회복해서" + getHp() + "이 되었습니다");
	}
	public Item[] getInventori() {
		return inventori;
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
		
	}

}
