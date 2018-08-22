package blackjack.sunjine33;

public class Dealer extends Player {
	private Deck deck;
	
	public Dealer() {
		this.isDealer = true;
		this.deck = new Deck(); //card shuffle, set
	}
	
	public void addCard(Card card) {
		super.addCard(card);
		if (this.sum > 16)
			stop();
	}
	
	public Card giveNewCard() {
		return deck.giveCard();
	}

	

}
