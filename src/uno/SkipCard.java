package uno;

/**
 * Class for Skip cards.
 */
public class SkipCard extends ColoredCard implements ActionCard {

	/**
	 * Constructor for Skip cards.
	 * @param color color of the card
	 */
	public SkipCard(Color color) {
		super(color);
	}
	
	@Override
	public String getName() {
		return getColor().getName() + " Skip";
	}

	@Override
	public Action getAction() {
		return Action.SKIP;
	}
}
