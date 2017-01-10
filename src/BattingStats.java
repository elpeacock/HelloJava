import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 1/9/17.
 */
public class BattingStats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.000");
        String anotherBatter;

        do {
            int[] atBats = getAtBatResults(sc);
            double battingAverage = calculateBattingAverage(atBats);
            double sluggingPercentage = calculateSluggingPercentage(atBats);
            System.out.println("Player's batting average is " + formatter.format(battingAverage));
            System.out.println("Player's slugging percentage is " + formatter.format(sluggingPercentage));
            anotherBatter = getAnotherBatter(sc);
        } while ( anotherBatter.equalsIgnoreCase("y") );
        System.out.println("Thank you for using the Batting Stats Calculator");


    }

    public static int getNumberOfAtBats(Scanner sc) {
        int numberOfAtBats;
        System.out.println("Enter number of at bats for this player: ");

        try {
            if (sc.hasNextInt()) {
                numberOfAtBats = sc.nextInt();
                return numberOfAtBats;
            } else {
                throw new InputMismatchException("Error! Invalid input, number of at bats must be a number - try again.");
            }
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println(e.getMessage());
            return getNumberOfAtBats(sc);
        }
    }

    public static int[] getAtBatResults(Scanner sc) {
        int numberOfAtBats = getNumberOfAtBats(sc);
        int [] atBats;
        atBats = new int[numberOfAtBats];

        for (int i = 0; i < atBats.length; i++) {
            System.out.println("How many bases did this player get for at bat number " + (i + 1) + "?");
            atBats[i] = getBasesEarned(sc);
        }
        return atBats;
    }

    public static int getBasesEarned(Scanner sc) {
        try {
            int bases = sc.nextInt();

            if (bases < 0 || bases > 4) {
                System.out.println("Please enter a number between 0 and 4. Out = 0, Single = 1, Double = 2, Triple = 3, Home Run = 4");
                return getBasesEarned(sc);
            }
            return bases;
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Error! Bases earned must be a number, try again.");
            return getBasesEarned(sc);
        }
    }

    public static double calculateSluggingPercentage(int [] atBats) {

        double sumOfBases = 0;

        for (int baseNumber : atBats) {
            sumOfBases += baseNumber;
        }

        return sumOfBases / atBats.length;
    }

    public static double calculateBattingAverage(int [] atBats) {

        double hitCount = 0;

        for (int baseNumber : atBats) {
            if (baseNumber > 0) {
                hitCount++;
            }
        }
        return hitCount / atBats.length;
    }

    public static String getAnotherBatter (Scanner sc) {

        String response;
        System.out.println("Enter batting stats for another player? (y or n)");

        try {
            response = sc.next();
            if ( (!response.equalsIgnoreCase("y") ) && (!response.equalsIgnoreCase("n") ) ) {
                throw new InputMismatchException("You have entered an invalid response, please enter y or n");
            }
            return response;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return getAnotherBatter(sc);
        }
    }
}
