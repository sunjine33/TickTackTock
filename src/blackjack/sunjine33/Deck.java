package blackjack.sunjine33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private static final String[] SHAPES = new String[] {"H", "S", "C", "D"};
	private static final int card_max = 13;
	
	private List<Card> queue = new ArrayList<>(52);
	
	private int lastIndex = -1;
	
//	int [] H_card = new int [card_max];
//	int [] S_card = new int [card_max];
//	int [] C_card = new int [card_max];
//	int [] D_card = new int [card_max];
	
	
	public Deck() {
		setting();
	}
	
//	private String randomCard(int i) {
//
//		String result = "";
//		
//		switch (i) {
//		case 1:
//			result = (d.Hcard() == 11) ? "(H)J" : (d.Hcard() == 12) ? "(H)Q" : (d.Hcard() == 13) ? "(H)K" : "(H)"+d.Hcard();
//			break;
//		case 2:
//			result = "S" + d.Scard();
//			break;
//		case 3:
//			result = "C" + d.Ccard();
//			break;
//		case 4:
//			result = "D" + d.Dcard();
//			break;
//		}
//		return result;
//	}

	public Card giveCard(String request) {
		return queue.get(++lastIndex);
	}

	
	private void setting() {
		int slen = SHAPES.length;
		for(int i = 0 ; i < slen ; i++) { //모양
			for (int j = 0; j < card_max; j++) { //숫자
				int num = j + 1;
				Card card = new Card(SHAPES[i], num);
				queue.add(card);
			}
		}
		
		Collections.shuffle(queue);
		this.lastIndex = 0;
	}
	

//	public int Dcard() {
//		boolean flag = true;
//		int n = 0;
//		while (true) {
//			int j = (int)(Math.random()*12)+0;
//			if (D_card[j] != 0) {
//				n = D_card[j];
//				D_card[j] = 0;
//				flag = false;
//			} else if(D_card[j] == 0){
//				continue;
//			}
//			return n;
//		}
//	}
//
//	public int Ccard() {
//		boolean flag = true;
//		int n = 0;
//		while (true) {
//			int j = (int)(Math.random()*12)+0;
//			if (C_card[j] != 0) {
//				n = C_card[j];
//				C_card[j] = 0;
//				flag = false;
//			} else if(C_card[j] == 0){
//				continue;
//			}
//			return n;
//		}
//	}
//
//	public int Scard() {
//		boolean flag = true;
//		int n = 0;
//		while (true) {
//			int j = (int)(Math.random()*12)+0;
//			if (S_card[j] != 0) {
//				n = S_card[j];
//				S_card[j] = 0;
//				flag = false;
//			} else if(S_card[j] == 0){
//				continue;
//			}
//			return n;
//		}
//	}
//
//	public int Hcard() {
//		boolean flag = true;
//		int n = 0;
//		while (true) {
//			int j = (int)(Math.random()*12)+0;
//			if (H_card[j] != 0) {
//				n = H_card[j];
//				H_card[j] = 0;
//				flag = false;
//			} else if(H_card[j] == 0) {
//				continue;
//			}
//			return n;
//		}
//	}

	
	
}
