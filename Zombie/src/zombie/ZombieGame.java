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
	private boolean isRun = true;
	private int soldierloca;

	public void run() {
		setGame();
		while (isRun) {
			play();
		}
	}

	private void setGame() {
		String name = setHeroName();
		hero = new Hero(name, loca);
		zombieKing = new ZombieKing();
		zombieKnight = new ZombieKnight();
		soldierloca = ran.nextInt(6) + 3;
		zombieSoldier = new ZombieSoldier(soldierloca);
		
	}
	private void setEquipment() {
		System.out.println(hero);
		int sel = inputNum("착용할 장비 번호")-1;
		Item[] inventori = hero.getInventori();
		
	}
	
	private String setHeroName() {
		String name = "";
		while (true) {
			name = inputString("용사의 이름을 알려주세요");
			System.out.println("용사의 이름이" + name + "가 맞습니까?");
			int sel = inputNum("1)맞아\n2)아니야\n이름 입력");
			if (sel == 1) {
				System.out.println(name + "의 모험 시작");
				break;
			}
		}
		return name;
	}

	private void play() {
		System.out.println("현재 위치 = " + loca);
		int move = inputNum("앞으로 이동하기(1),휴식하기(2),인벤토리 열기(3)");

		if (move == 1) {
			loca = loca + 1;
			hero.setLocation(loca); 

			if (hero.getLocation() == 5) 
				battle(zombieSoldier);
			if (hero.getLocation() == 10) 
				battle(zombieKnight);
			if (hero.getLocation() == 14) 
				battle(zombieKing);		
		} else if (move == 2) {
			hero.recovery();
		}
		else if(move == 3) {
			showInventori();
		}
	}
	private void battle(Units enemy) {
		System.out.printf("%s조우! 전투를 시작합니다.", enemy.getName());
		while (true) {
			int sel = inputNum("공격하기(1),회복마법(2): ");
			if (sel == 1) {
				enemy.attack(hero);
				hero.attack(enemy);
			}
			else if (sel == 2)
				hero.recovery();
			
			if (hero.getHp() <= 0) {
				System.out.printf("%s가 죽었습니다. 게임오버!", hero.getName());
				break;
			}
			if (enemy.getHp() <= 0) {
				System.out.printf("%s 격파!",enemy.getName());
				dropItem();
				break;
			}
		}
	}
	
	private void showInventori() {
		System.out.println(hero);
	}
	private void dropItem() {
		int dice = ran.nextInt(999);
		
		//0~2
		//처음 꺼는 드랍률 50퍼정도로
		// 안뜨면 확률 25퍼증가
		// 뜨면 -
		// 1or 2로 해서
		// 웨펀 아머 구분
		// 1이면 1번 2면 2번 반복해서 드랍아이템
		// 
	}
	private int inputNum(String msg) {
		int num = -1;
		while (true) {
			System.out.println(msg + " : ");
			String input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
			} catch (Exception e) {
				System.err.println("숫자를 입력해");
			}
			if (num != -1)
				break;
			
		}
		return num;
	}

	private String inputString(String msg) {
		System.out.println(msg + " : ");
		return scanner.nextLine();
	}
}
