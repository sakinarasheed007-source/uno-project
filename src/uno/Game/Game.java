package uno.Game;

import uno.Card;
import uno.ColoredCard;
import uno.IllegalCardException;
import uno.Player;
import uno.players.BeginnerPlayer;

import java.util.List;

public class Game {

    public Game(Player[] players, boolean output) {

    }

    public int play() throws IllegalCardException {

    }

    public static void main(String[] args){
        Player player1 = new Player() {
            @Override
            public int makeChoice(Card top, List<Card> hand, ColoredCard.Color color) {
                return 0;
            }

            @Override
            public ColoredCard.Color pickColor() {
                return null;
            }

            @Override
            public void startGame(int players, int index, Card top) {

            }

            @Override
            public void playerPlays(int index, Card card) {

            }

            @Override
            public void playerPicks(ColoredCard.Color color) {

            }

            @Override
            public void playerDraws(int index) {

            }

            @Override
            public void deckShuffles() {

            }
        };  //Player 1 object
        Player player2 = new Player() {
            @Override
            public int makeChoice(Card top, List<Card> hand, ColoredCard.Color color) {
                return 0;
            }

            @Override
            public ColoredCard.Color pickColor() {
                return null;
            }

            @Override
            public void startGame(int players, int index, Card top) {

            }

            @Override
            public void playerPlays(int index, Card card) {

            }

            @Override
            public void playerPicks(ColoredCard.Color color) {

            }

            @Override
            public void playerDraws(int index) {

            }

            @Override
            public void deckShuffles() {

            }
        };  //Player 2 object

    }
}
