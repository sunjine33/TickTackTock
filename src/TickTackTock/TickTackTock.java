package TickTackTock;


import java.util.Scanner;

public class TickTackTock {
	private static int count = 0;
	public static Scanner sc = new Scanner(System.in);
	static boolean flag = true;
	private static String whoWin = "";
	private static int a = 0;
	private static Board b = new Board();

	public static void main(String[] args) {

		while (true) {
			start();
		}
	}

	private static void start() {
		
		playGame();
	}

	private static void playGame() {
		if (count == 0) {
			System.out.println("게임을 시작합니까? Y/n");
			String request = sc.next();
			if(request.equals("Y")){
			while (true) {
				int a = first_second();
				if (a != 1) {
					continue;
				} else
					break;
			}
			if (a == 1) {
				Play(whoWin);
				count++;
			}
			}
		}else if(count != 0) {
			System.out.println("리플레이??? Y/n");
			String request = sc.next();
			if(request.equals("Y")) {
				whoWin = null;
				b = new Board();
				flag = true;
				while (true) {
					int a = first_second();
					if (a != 1) {
						continue;
					} else
						break;
				}
				if (a == 1) {
					Play(whoWin);
					count++;
				}
			}else if(request.equals("n")) {
				flag = false;
				whoWin = null;
				a = 0;
				count = 0;
			}
	}
	}
	public static int first_second() {
		switch (playerP() - comP()) {
		case -2:
		case 1:
			whoWin = "user 선공";
			a = 1;
			break;
		case -1:
		case 2:
			whoWin = "com 선공";
			a = 1;
			break;
		case 0:
			whoWin = "무승부";
			break;
		}
		return a;
	}

	private static void Play(String first_second) {
		if (whoWin.equals("user 선공")) {
			userFirst();
		} else if (whoWin.equals("com 선공")) {
			comFirst();
		}

	}

	public static int playerP() {
		int players = 0;
		System.out.println("가위 바위 보!!!");
		String player = sc.next();
		if (player.equals("가위")) {
			players = 1;
		} else if (player.equals("바위")) {
			players = 2;
		} else if (player.equals("보")) {
			players = 3;
		} else
			System.out.println("다시 선택하세요");
		return players;
	}

	public static int comP() {
		int com = (int) (Math.random() * 3) + 1;

		if (com == 1) {
			System.out.println("Com: 가위");
		} else if (com == 2) {
			System.out.println("Com: 바위");
		} else if (com == 3) {
			System.out.println("Com: 보");
		}
		return com;
	}

	public static void userFirst() {
		System.out.println(whoWin + "\t");
		while (true) {
			
			System.out.println("User Turn 어디에 둡니까??");
			flag = b.playerPutStone();
			if(flag == false) {
				b.win("player win");
				break;
			}
			System.out.println();
			System.out.println("Com turn 어디에 둡니까??");
			flag = b.comPutStone();
			if(flag == false) {
				b.win("com win");
				break;
			}
		}
	}

	public static void comFirst() {
		System.out.println(whoWin + "\t");
		
		while (true) {			
			System.out.println("Com turn 어디에 둡니까??");
			
			flag = b.comPutStone();
			if(flag == false) {
				b.win("com win");
				break;
			}
			System.out.println();
			System.out.println("User Turn 어디에 둡니까??");

			flag = b.playerPutStone();
			if(flag == false) {
				b.win("player win");
				break;
			}
		}
	}
	
	
}

