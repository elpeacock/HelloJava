/**
 * Created by user on 1/17/17.
 */

/**
 * Create and name two player classes (subclasses of Player).
 * One of these players should always select rock.
 */
public class RoshamboRockPlayer extends RoshamboPlayer {

    @Override
    public String generateRoshambo(OOValidator validate) {
        return Roshambo.ROCK.toString();
    }

    @Override
    public void setName(OOValidator validate) {
        this.name = "Jane Janeway";
    }
}
