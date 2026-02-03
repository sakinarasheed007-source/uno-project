package uno;

import uno.Game.PlayStatus;

/**
 * Exception thrown when a player plays an illegal card.
 * This card might be illegal because it doesn't match the number, color,
 * or kind, because the index doesn't refer to a card in the player's hand,
 * or because it's a Wild Draw Four played when other cards were playable.
 */
@SuppressWarnings("serial")
public class IllegalCardException extends Exception {
	
	private final int playerNumber;
	private final PlayStatus reason;
	
	/**
	 * Constructor taking the index of the player playing the illegal card
	 * and the reason why it's illegal.
	 * @param playerNumber index of player
	 * @param reason why it's illegal
	 */
	public IllegalCardException(int playerNumber, PlayStatus reason) {
		super(makeMessage(playerNumber, reason));
		this.playerNumber = playerNumber;
		this.reason = reason;
	}
	
	/**
	 * Accessor for index of player playing the illegal card.
	 * @return index of player
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	/**
	 * Accessor for reason why the card is illegal.
	 * @return reason
	 */
	public PlayStatus getReason() {
		return reason;
	}
	
	private static String makeMessage(int playerNumber, PlayStatus reason) {
		String message = "Player " + (playerNumber + 1) + " tried to play a ";
		switch(reason) {
		case NOT_IN_HAND:
			message += "card that was not in their hand.";
			break;
		case DOES_NOT_MATCH:
			message += "card that does not match the top card.";
			break;
		case ILLEGAL_WILD_DRAW_FOUR:
			message += "Wild Draw Four with other playable cards in their hand.";
			break;
		case LEGAL:
			throw new RuntimeException("Legal card played. IllegalCardException thrown by mistake.");			
		}
		
		return message;		
	}
}
