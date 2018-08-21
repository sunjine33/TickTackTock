package blackjack.sunjine33;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Util{
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> mycard = new ArrayList<>(5);
	
	@Override
	public int sum(ArrayList mycard) {
		
		return 0;
	}

	@Override
	public String request() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ArrayList getCard(String card) {
		int count = 0;
		mycard.add(count, card);
		count++;
		return mycard;
		
	}

}
