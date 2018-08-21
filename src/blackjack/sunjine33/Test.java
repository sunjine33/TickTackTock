package blackjack.sunjine33;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] arr = new String [52];
		boolean flag = true;
		Dealer d = new Dealer();
		int i = 0;
		
		while(flag) {
			System.out.println("카드를 받으시겠습니까?");
			String s = sc.next();
			if(s.equals("y")) {
				arr[i] = d.giveCard();
				i++;
			}else
				flag = false;
			
			if(i == 52) {
				flag = false;
			}
		}
		System.out.println("카드를 보겠습니까?");
		for(i = 0 ; i < 52 ; i++) {
			System.out.println(arr[i]);
		}
	}
}
