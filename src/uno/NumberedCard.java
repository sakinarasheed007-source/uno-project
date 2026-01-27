package uno;

/**
 * Class for all numbered cards in Uno.
 */
public class NumberedCard extends ColoredCard {
	private final int number;	
	
	/**
	 * Constructor for {@code NumberedCard}.
	 * @param number number of card
	 * @param color color of card
	 */
	public NumberedCard(int number, Color color) {
		super(color);
		this.number = number;
	}
	
	/**
	 * Accessor for card number
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	@Override
	public String getName() {
		return getColor().getName() + " " + number;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
