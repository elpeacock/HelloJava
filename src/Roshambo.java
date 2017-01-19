/**
 * Created by user on 1/17/17.
 */

/**
 * Create an enumeration called Roshambo that stores three values: rock, paper, and scissors.
 * This enumeration should include a toString method that can convert the selected value to a String.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    @Override
    public String toString() {
        return super.toString();
    }

    public static String compareRoshambo(String myRoshambo, String opponentRoshambo, RoshamboPlayer opponent,
                                         RoshamboPlayer human) {
        String message = "";
        if (myRoshambo.equalsIgnoreCase(opponentRoshambo)){
            message = "Tie!!";
        } else if ( (myRoshambo.equalsIgnoreCase("ROCK") ) && (opponentRoshambo.equalsIgnoreCase("PAPER") ) ) {
            message = "Paper covers Rock - " + opponent.getName() + " wins!";
            opponent.gamesWon++;
            human.gamesLost++;
        } else if ( (myRoshambo.equalsIgnoreCase("ROCK") ) && (opponentRoshambo.equalsIgnoreCase("SCISSORS") ) ) {
            message = "Rock smashes Scissors - " + human.getName() + " wins!";
            human.gamesWon++;
            opponent.gamesLost++;
        } else if ( (myRoshambo.equalsIgnoreCase("PAPER") ) && (opponentRoshambo.equalsIgnoreCase("ROCK") ) ) {
            message = "Paper covers Rock - " + human.getName() + " wins!";
            human.gamesWon++;
            opponent.gamesLost++;
        } else if ( (myRoshambo.equalsIgnoreCase("PAPER") ) && (opponentRoshambo.equalsIgnoreCase("SCISSORS") ) ) {
            message = "Scissors cut Paper - " + opponent.getName() + " wins!";
            opponent.gamesWon++;
            human.gamesLost++;
        } else if ( (myRoshambo.equalsIgnoreCase("SCISSORS") ) && (opponentRoshambo.equalsIgnoreCase("ROCK") ) ) {
            message = "Rock smashes Scissors - " + opponent.getName() + " wins!";
            opponent.gamesWon++;
            human.gamesLost++;
        } else if ( (myRoshambo.equalsIgnoreCase("SCISSORS") ) && (opponentRoshambo.equalsIgnoreCase("PAPER") ) ) {
            message = "Scissors cut Paper - " + human.getName() + " wins!";
            human.gamesWon++;
            opponent.gamesLost++;
        }
        return message;
    }
}

