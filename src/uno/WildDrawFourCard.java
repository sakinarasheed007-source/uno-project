package uno;

/**
 * Class for Wild Draw Four cards.
 */
public class WildDrawFourCard extends WildCard implements ActionCard {

	@Override
	public Action getAction() {
		return Action.DRAW_FOUR;
	}

	@Override
	public String getName() {
		return "Wild Draw Four";
	}

}
