package uno;

/**
 * Exception thrown when a player draws with legal cards to play.
 */
@SuppressWarnings("serial")
public class IllegalDrawException extends Exception {
	private final int playerNumber;	
	
	/**
	 * Constructor taking the index of the player drawing illegally.
	 * @param playerNumber index of player
	 */
	public IllegalDrawException(int playerNumber) {
		super("Player " + (playerNumber + 1) + " drew when they had legal cards to play.");
		this.playerNumber = playerNumber;		
	}
	
	/**
	 * Accessor for index of player playing the illegal card.
	 * @return index of player
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}	
}
