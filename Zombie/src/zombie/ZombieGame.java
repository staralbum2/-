package zombie;

import java.util.Random;
import java.util.Scanner;

public class ZombieGame {
	
	private Random ran = new Random();
	private Scanner scanner = new Scanner(System.in);
	private Hero hero;
	private ZombieKing zombieKing;
	private ZombieKnight zombieKnight;
	private ZombieSoldier zombieSoldier;
	private int loca = 1;
	
	public void run() {
		setGame();
	}
	
	private void setGame() {
		String name = "";
		while(true) {
			name = inputString("용사의 이름을 알려주세요\n");
			System.out.println("용사의 이름을" + name + "으로 결정하시겠습니까?");
			int sel = inputNum("1)맞아\n2)아니야\n이름 입력");
			if(sel == 1) {
				System.out.println(name + "의 모험 시작");
				break;
			}
		}
		hero = new Hero(name,loca);
		zombieKing = new ZombieKing();
		zombieKnight = new ZombieKnight();
		int soldierLocation = ran.nextInt(6)+3;
		zombieSoldier = new ZombieSoldier(soldierLocation);
	}
	
	private int inputNum(String msg) {
		System.out.println(msg + " : ");
		String input = scanner.nextLine();
		int num = -1;
		try {
			num = Integer.parseInt(input);
		} catch (Exception e) {
			System.err.println("숫자를 입력해");
		}
		return num;
	}
	private String inputString(String msg) {
		System.out.println(msg + " : ");
		return scanner.nextLine();
	}
}
