package uno.GameTime;

import uno.IllegalCardException;
import uno.Player;
import uno.players.BeginnerPlayer;

public class Game {

    public Game(Player[] players, boolean output) {

    }

    public int play() throws IllegalCardException {
        //Creates two new player objects to play against each other
        Player[] players = {
                new BeginnerPlayer(),
                new BeginnerPlayer()
        };

        Game game = new Game(players, true);
        int winner = game.play();
        return winner;


    }

    public static void main(String[] args){

    }
}
