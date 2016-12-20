/**
 * Created by user on 12/20/16.
 */
public class RollDice {
    public static int rollEmOut(int numOfSides) {
        return (int) Math.ceil(Math.random() * numOfSides);
    }
}
