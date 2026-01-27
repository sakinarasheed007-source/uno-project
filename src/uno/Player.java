package uno;

import java.util.List;
import uno.ColoredCard.Color;

/**
 * Interface for Uno players.
 * Your class must implement this interface.
 */
public interface Player {	
	/**
	 * Method that chooses which card to play out of a given hand.
	 * Input is the current top card, the hand the player has, and the current
	 * color, which is needed if a Wild has been played.
	 * The method returns the index (between 0 and {@code hand.size() - 1}) of
	 * the card in {@code hand} to play or -1 if no card will be played.
	 * <p> 
	 * Note: This method must be fully implemented in order to play.
	 * @param top current top card
	 * @param hand list of cards in hand
	 * @param color current color 
	 * @return index of card in hand to play
	 */
	int makeChoice(Card top, List<Card> hand, Color color);	
	
	/**
	 * Method that picks the new color if a Wild card has been played.
	 * This method must return {@code ColoredCard.Color.RED}, 
	 * {@code ColoredCard.Color.YELLOW}, {@code ColoredCard.Color.GREEN},
	 * or {@code ColoredCard.Color.BLUE}.
	 * <p>
	 * Note: This method must be fully implemented in order to play.
	 * @return picked color
	 */
	Color pickColor();	
	
	/**
	 * Method used to inform classes implementing the {@code Player}
	 * interface that a new game is starting with the given number of players,
	 * with the current player at the given index, and the given top card as
	 * the first card on the discard pile.
	 * <p>
	 * Note: This method may be empty but can be used for strategy purposes.
	 * @param players number of players
	 * @param index index of current player
	 * @param top card on top
	 */
	void startGame(int players, int index, Card top);
	
	/**
	 * Method used to inform classes implementing the {@code Player}
	 * interface that the player at the given index has just played a
	 * particular card.
	 * <p>
	 * Note: This method may be empty but can be used for strategy purposes.
	 * @param index index of player
	 * @param card card played
	 */
	void playerPlays(int index, Card card);
	
	/**
	 * Method used to inform classes implementing the {@code Player}
	 * interface which color has been chosen after a player has played
	 * a Wild card
	 * <p>
	 * Note: This method may be empty but can be used for strategy purposes.
	 * @param color color chosen
	 */	
	void playerPicks(Color color);
	
	/**
	 * Method used to inform classes implementing the {@code Player}
	 * interface that the player at the given index has just drawn a
	 * card.
	 * <p>
	 * Note: This method may be empty but can be used for strategy purposes. 
	 * @param index index of player
	 */
	void playerDraws(int index);
	
	/**
	 * Method used to inform classes implementing the {@code Player}
	 * interface that the deck has just been shuffled.  This information
	 * might be useful to {@code Player} classes employing a card-counting
	 * strategy. 
	 * <p>
	 * Note: This method may be empty but can be used for strategy purposes.	
	 */
	void deckShuffles();
}
