import java.util.Scanner;

/**
 * Created by user on 12/20/16.
 */
public class RollDice {
    public static int rollEmOut(int numOfSides) {
        return (int) Math.ceil(Math.random() * numOfSides);
    }

    public static void main(String[] args) {
        int numOfSides;
        int firstRoll;
        int secondRoll;
        String response = "yes";

        do {
            System.out.println("How many sides does your die have?");
            Scanner sc = new Scanner(System.in);
            numOfSides = sc.nextInt();
            sc.nextLine();

            firstRoll = RollDice.rollEmOut(numOfSides);
            secondRoll = RollDice.rollEmOut(numOfSides);

            System.out.println("You rolled " + firstRoll + " and " + secondRoll);
            System.out.println("Roll Again? (yes/no): ");
            response = sc.nextLine();

        } while ( response.trim().equalsIgnoreCase("yes") );

        System.out.println("thanks for playing!");
    }
}
