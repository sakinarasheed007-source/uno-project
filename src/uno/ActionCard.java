package uno;

/**
 * Interface for all action cards
 * (Draw Two, Wild Draw Four, Skip, and Reverse). *
 */
public interface ActionCard extends Card {
	/**
	 * Enum listing possible actions.
	 */
	public enum Action {
		DRAW_TWO,
		DRAW_FOUR,
		SKIP,
		REVERSE
	}

	/**
	 * Accessor for the action that a card performs.
	 * @return action
	 */
	Action getAction();
}
