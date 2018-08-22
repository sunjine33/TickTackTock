package blackjack.sunjine33;

public class Card {
	private String shape;
	private int num;

	public Card(String shape, int num) {
		super();
		this.shape = shape;
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return this.shape + this.num;
	}

}
