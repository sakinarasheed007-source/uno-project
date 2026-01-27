package uno;

/**
 * Class for Reverse cards.
 */
public class ReverseCard extends ColoredCard implements ActionCard {

	/**
	 * Constructor for Reverse cards.
	 * @param color color of the card
	 */
	public ReverseCard(Color color) {
		super(color);
	}

	@Override
	public Action getAction() {
		return Action.REVERSE;
	}

	@Override
	public String getName() {
		return getColor().getName() + " Reverse";
	}
}
