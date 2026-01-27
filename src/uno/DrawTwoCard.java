package uno;

/**
 * Class for Draw Two cards.
 */
public class DrawTwoCard extends ColoredCard implements ActionCard {

	/**
	 * Constructor for Draw Two cards.
	 * @param color color of the card
	 */
	public DrawTwoCard(Color color) {
		super(color);
	}

	@Override
	public String getName() {
		return getColor().getName() + " Draw Two";
	}

	@Override
	public Action getAction() {
		return Action.DRAW_TWO;
	}
}
