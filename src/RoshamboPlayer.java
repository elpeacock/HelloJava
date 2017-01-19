/**
 * Created by user on 1/17/17.
 */

/**
 * Create an abstract class named Player that stores a name and a Roshambo value.
 * This class should include an abstract method named generateRoshambo that allows
 * an inheriting class to generate and return a Roshambo value.
 */
public class RoshamboPlayer {
    protected Roshambo choice;
    protected String name;
    protected int numberOfGamesPlayed = 0;
    public int gamesWon = 0;
    public int gamesLost = 0;


    public String generateRoshambo(OOValidator validate) {
        return choice.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(OOValidator validate) {
        this.name = name;
    }
}
