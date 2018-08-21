package blackjack.sunjine33;

public class Deck {
	private final int card_max = 13;
	int [] H_card = new int [card_max];
	int [] S_card = new int [card_max];
	int [] C_card = new int [card_max];
	int [] D_card = new int [card_max];
	
	
	public Deck() {
		setting();
	}

	private void setting() {
		for(int i = 0 ; i < card_max ; i++) {
			int j = i+1;
			H_card[i] = j;
			S_card[i] = j;
			C_card[i] = j;
			D_card[i] = j;
		}
	}
	
}
