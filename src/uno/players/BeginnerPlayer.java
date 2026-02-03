package uno.players;
/*
Title       : BeginnerPlayer.java
Description : A very simple Uno player that always playe the first legal card.
Author      : Sakina Hussain && Bethany Mixon
Date        : 01/29/2026
Version     : 1.0
Java Version: Java 24
 */

// This import allows us to use all the Uno classes provided for the project
// Examples: Card, Player, WildCard, ColoredCard, etc.
import uno.*;
import uno.Game;
// This import allows use to use the List type, which stores the cards in our hand
import java.util.List;

//Implements the PLayer class
public class BeginnerPlayer implements Player{
    /*
    * This method is REQUIRED by the Player interface.
    * It is called when we need to choose which card to play.
    *
    * top - the card currently on top of the discard pile
    * hand - a list of all the cards in our hand
    * color - the current color (important after a Wild card)
    *
    * We return:
    * - the index of the card we want to play
    * - OR -1 if we cannot play any card
     */
    public int makeChoice(Card top, List<Card> hand, ColoredCard.Color color ) {

        // We go through the hand one card at a time
        for (int i = 0; i < hand.size(); i ++) {

            // Get the current card form our hand
            Card currentCard = hand.get(i);

            // If the card is a Wild card, it is always legal to play
            if (currentCard instanceof WildCard) {
                // Play this card by returning its position
                return i;
            }

            // If the card has a color (meaning it is not a Wild)
            if  (currentCard instanceof ColoredCard) {

                // Convert the card into a ColoredCard so we can check its color
                ColoredCard coloredCard = (ColoredCard) currentCard;

                // If the card's colore matches the current color, it is legal
                if (coloredCard.getColor() == color) {
                    return i;
                }

                // If the card type matches the top card type (number/action),
                // then it is also legal to play
                if (currentCard.getClass() == top.getClass()) {
                    return i;
                }
            }
        }
        // If we reach here, we found no legal card
        // Returning -1 means we must draw a card
        return -1;
    }
    /*
    *This method is REQUIRED by the Player interface.
    * It is called after we play a Wild or Wild Draw Four card
    *
    * For simplicity, we always choose RED.
    * This is legal and easy for a beginner.
     */
    public ColoredCard.Color pickColor() {
        return ColoredCard.Color.RED;
    }
    /*
    * This methods below are required by the Player interface.
    * but the assignment allow them to empty.
    * We include them so the program will compile correctly.
     */

    /*
    * Called when the game starts.
    * We are not using this information, so we leave it empty/
     */
    public void startGame (int player, int index, Card start) {
        // No setup needed for this simple player
    }

    /*
    * Called when any player plays a card.
    * We are not tracking other players.
     */
    public void playerPlays (int index, Card card) {
        // No action needed
    }

    /*
    * Called when a player chooses a color.
    * We are not tracking color choices.
     */
    public void playerPicks (ColoredCard.Color color) {
        // No action needed
    }

    @Override
    public void playerDraws(int index) {

    }

    @Override
    public void deckShuffles() {

    }

    public static void main(String[] args){
        //Creates two players to play against each other
        Player player1 = new BeginnerPlayer();
        Player player2 = new BeginnerPlayer();

        Player[] players = new Player[]{
                player1, player2
        };

        //Enables output to the console
        uno.Game = new Game(players, true);

        try {
            int winnerIndex = game.play();
            System.out.println("The winner is: " + winnerIndex);

        } catch (IllegalCardException e) {
            System.out.println("Illegal move!");
        }
    }
}
