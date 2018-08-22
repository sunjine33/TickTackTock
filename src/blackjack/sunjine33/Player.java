package blackjack.sunjine33;

public class Player {
	protected int sum;
	protected boolean isDealer;
	protected boolean didStop;
	
	public void addCard(Card card) {
		sum += card.getNum();
	}
	
	public boolean isOver21() {
		return this.sum > 21;
	}
	
	public boolean didStop() {
		return this.didStop;
	}
	
	public void stop() {
		this.didStop = true;
	}
 	
	public Card giveNewCard() {
		return null;
	}
}
