package blackjack.sunjine33;

public class Dealer {

	Deck d = new Deck();

	private String randomCard(int i) {

		String result = "";
		
		switch (i) {
		case 1:
			result = (d.Hcard() == 11) ? "(H)J" : (d.Hcard() == 12) ? "(H)Q" : (d.Hcard() == 13) ? "(H)K" : "(H)"+d.Hcard();
			break;
		case 2:
			result = "S" + d.Scard();
			break;
		case 3:
			result = "C" + d.Ccard();
			break;
		case 4:
			result = "D" + d.Dcard();
			break;
		}
		return result;
	}

	public String giveCard(String request) {
		String s = "";
		
		if (request.equals("yes")) {
			int i = (int) (Math.random() * 4) + 1;
			s = randomCard(i);
		}
		return s;
	}

}
