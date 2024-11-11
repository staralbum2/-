package zombie;

import java.util.Random;

public class ZombieGame {
	
	private Random ran = new Random();
	
	private Hero hero;
	private ZombieKing zombieKing;
	private ZombieKnight zombieKnight;
	private ZombieSoldier zombieSoldier;
	private int loca = 1;
	
	public void run() {
		setGame();
	}
	
	private void setGame() {
		hero.setLocation(loca);
		zombieKing = new ZombieKing();
		zombieKnight = new ZombieKnight();
		int soldierLocation = ran.nextInt(6)+3;
		zombieSoldier = new ZombieSoldier(soldierLocation);
	}
}
