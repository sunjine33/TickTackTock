package blackjack.sunjine33;

import java.util.Scanner;

public class BlackJack {
	private Player dealer;
	private Player user;
	private Deck deck;
	private boolean isEnd = false;
	private Scanner scanner;
	
	public BlackJack() {
		this.scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BlackJack jack = new BlackJack();
		if (jack.askStartGame())
			jack.playGame(false);
	}

	private boolean askStartGame() {
		System.out.println("Are u Ready?? (Y/n)");
		String answer = scanner.next();
		return "Y".equalsIgnoreCase(answer);
	}

	/*
	 * game 시작!!
	 */
	private void playGame(boolean alreadyPlay) {
		String msg = alreadyPlay ? "Play again?? (Y/n)" : "Are u Ready?? (Y/n)"; 
		String answer = ask(msg);
		if ("n".equalsIgnoreCase(answer)) {
			System.exit(0);
		}
		
		this.deck = new Deck(); // card setting
		
		this.dealer = new Dealer();
		this.user = new User();
		
		while(!isEnd) {
			playCard();
		}
		
		playGame(true);
	}

	private String ask(String msg) {
		System.out.println(msg);
		String answer = scanner.next();
		return answer;
	}

	// 카드 나눠주기
	private void playCard() {
		user.addCard(deck.giveNewCard()); // sum계산(합, 21초과여부등)
		if (user.isOver21()) {
			endGame(user);
		}
		
		dealer.addCard(deck.giveNewCard()); // sum계산(합, 16초과 여부등)
	}
	
	private void addCard(Player player) {
		if (!player.isDealer && !player.didStop()) {
			String answer = ask("Do u want card?? (Y/n)");
			if ("n".equalsIgnoreCase(answer))
				player.stop();
		}
		
		player.addCard(((Dealer)dealer).giveNewCard());
	}

	private void endGame(Player player) {
		if (player.isDealer) {
			System.out.println("You Win!!");
		}
		
		isEnd = true;
		this.user = null;
		this.dealer = null;
		this.deck = null;
	}

}
