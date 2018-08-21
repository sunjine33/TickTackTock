package blackjack.sunjine33;

public class Dealer {

	Deck d = new Deck();
	Card c = new Card();

	private String randomCard(int i) {

		String result = "";
		
		switch (i) {
		case 1:
			result = "H" + c.Hcard();
			break;
		case 2:
			result = "S" + c.Scard();
			break;
		case 3:
			result = "C" + c.Ccard();
			break;
		case 4:
			result = "D" + c.Dcard();
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
