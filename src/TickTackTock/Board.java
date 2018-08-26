package TickTackTock;


public class Board extends TickTackTock {
	public static String[] board;
	public final static int boardSize = 9;
	private int count1;
	boolean flag1 = true;
	public static String player;

	Board() {
		createBoard();
	}

	private void createBoard() {
		board = new String[boardSize];
		int k = 1;
		for (int i = 0; i < boardSize; i++) {
			board[i] = "" + k++;
		}
	}

	public static void viewBoard() {
		System.out.println("보드현황");
		System.out.print("_________");
		for (int i = 0; i < boardSize; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print("│" + board[i] + "│");
		}
		System.out.println();
		System.out.print("￣￣￣￣￣￣￣\n");
	}

	public boolean playerPutStone() {
		while (flag1 == true) {
			player = sc.next();
			int n = Integer.parseInt(player);
			if (board[n - 1].equals("O") || board[n - 1].equals("X")) {
				System.out.println("다시 두세요.");
				continue;
			} else if (!board[n - 1].equals("O") || !board[n - 1].equals("X")) {
				board[n - 1] = "O";
				count1++;
				viewBoard();
				flag1 = winLose();
				break;
			}
			if (count1 == 9) {
				flag1 = false;
				break;
			}
		}
		return flag1;
	}

	public boolean comPutStone() {
		while (flag1 == true) {
			player = sc.next();
			int n = Integer.parseInt(player);
			if (board[n - 1].equals("O") || board[n - 1].equals("X")) {
				System.out.println("다시 두세요.");
				continue;
			}

			else if (!board[n - 1].equals("O") || !board[n - 1].equals("X")) {
				board[n - 1] = "X";
				count1++;
				viewBoard();
				flag1 = winLose();
				break;
			}
			if (count1 == 9) {
				flag1 = false;
				break;
			}
		}
		return flag1;
	}

	public boolean winLose() {

		// 012
		if (board[0].equals("O") && board[1].equals("O") && board[2].equals("O")) {
			flag1 = false;

		} else if (board[0].equals("X") && board[1].equals("X") && board[2].equals("X")) {
			flag1 = false;

		} // 036
		else if (board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) {
			flag1 = false;

		} else if (board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) {
			flag1 = false;

		} // 048
		else if (board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
			flag1 = false;

		} else if (board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
			flag1 = false;

		} // 147
		else if (board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) {
			flag1 = false;

		} else if (board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) {
			flag1 = false;

		} // 246
		else if (board[2].equals("O") && board[4].equals("O") && board[6].equals("O")) {
			flag1 = false;

		} else if (board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) {
			flag1 = false;

		} // 258
		else if (board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) {
			flag1 = false;

		} else if (board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) {
			flag1 = false;

		} // 345
		else if (board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) {
			flag1 = false;

		} else if (board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) {
			flag1 = false;

		} // 678
		else if (board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) {
			flag1 = false;

		} else if (board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) {
			flag1 = false;

		}

		return flag1;

	}

	public void win(String win) {
		if (win.equals("player win")) {
			System.out.println("PLAYER의 승리!!!");
		} else if (win.equals("com win")) {
			System.out.println("PLAYER2의 승리!!!");
		}
	}

}
