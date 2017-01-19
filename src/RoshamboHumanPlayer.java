/**
 * Created by user on 1/17/17.
 */

/**
 * Create a third player class that extends Player and implements the generateRoshambo method.
 * For this class, generateRoshambo gets input from the human player and returns the value chosen.
 */
public class RoshamboHumanPlayer extends RoshamboPlayer {

    public static int chooseAnOpponent(OOValidator validate) {
        int opponentPick = validate.getIntWithinRange("Who would you like to play against? (enter the number that " +
                "corresponds with your opponent of choice) \n1.) Jane Janeway \n2.) Bob Bobberson", 1, 2);
        return opponentPick;
    }

    @Override
    public String generateRoshambo(OOValidator validate) {
        int roshamboPick = validate.getIntWithinRange("What's your weapon? (enter the number that corresponds with " +
                "your choice!) \n1. Rock \n2. Paper \n3. Scissors", 1, 3);

        switch (roshamboPick) {
            case 1:
                choice = Roshambo.ROCK;
                break;
            case 2:
                choice = Roshambo.PAPER;
                break;
            case 3:
                choice = Roshambo.SCISSORS;
                break;
        }
        return choice.toString();
    }

    @Override
    public void setName(OOValidator validate) {
        this.name = validate.getRequiredString("Hello human, enter your name: ");
    }


}
