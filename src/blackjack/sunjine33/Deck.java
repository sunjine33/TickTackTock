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
	
	public int Dcard() {
		boolean flag = true;
		int n = 0;
		while (true) {
			int j = (int)(Math.random()*12)+0;
			if (D_card[j] != 0) {
				n = D_card[j];
				D_card[j] = 0;
				flag = false;
			} else if(D_card[j] == 0){
				continue;
			}
			return n;
		}
	}

	public int Ccard() {
		boolean flag = true;
		int n = 0;
		while (true) {
			int j = (int)(Math.random()*12)+0;
			if (C_card[j] != 0) {
				n = C_card[j];
				C_card[j] = 0;
				flag = false;
			} else if(C_card[j] == 0){
				continue;
			}
			return n;
		}
	}

	public int Scard() {
		boolean flag = true;
		int n = 0;
		while (true) {
			int j = (int)(Math.random()*12)+0;
			if (S_card[j] != 0) {
				n = S_card[j];
				S_card[j] = 0;
				flag = false;
			} else if(S_card[j] == 0){
				continue;
			}
			return n;
		}
	}

	public int Hcard() {
		boolean flag = true;
		int n = 0;
		while (true) {
			int j = (int)(Math.random()*12)+0;
			if (H_card[j] != 0) {
				n = H_card[j];
				H_card[j] = 0;
				flag = false;
			} else if(H_card[j] == 0) {
				continue;
			}
			return n;
		}
	}
	
}
