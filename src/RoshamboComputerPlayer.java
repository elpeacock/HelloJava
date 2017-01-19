/**
 * Created by user on 1/17/17.
 */

/**
 * Create and name two player classes (subclasses of Player).
 * player should randomly select rock, paper, or scissors (a 1 in 3 chance of selecting each).
 */
public class RoshamboComputerPlayer extends RoshamboPlayer {

    @Override
    public void setName(OOValidator validate) {
        this.name = "Bob Bobberson";
    }

    @Override
    public String generateRoshambo(OOValidator validate) {
        int random = (int) Math.ceil(Math.random() * Roshambo.values().length);
        if (random == 1) {
            choice = Roshambo.ROCK;
        } else if (random == 2) {
            choice = Roshambo.PAPER;
        } else if (random == 3) {
            choice = Roshambo.SCISSORS;
        }
        return choice.toString();
    }

}
