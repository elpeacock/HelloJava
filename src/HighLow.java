import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 1/4/17.
 */
public class HighLow {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String playAgain;

        System.out.println("Hi, lets play HighLow!");
        System.out.println("I, your computer, have randomly generated a whole number between 1 and 100.");
        do {
            System.out.println("Try to guess my number!");
            playTheGame();
            sc.nextLine();
            System.out.println("Do you want to play again? (yes or no)");
            playAgain = sc.nextLine().trim();
        } while ( ("y".equalsIgnoreCase(playAgain) ) || ("yes".equalsIgnoreCase(playAgain) ) );
        System.out.println("thanks for playing!");
    }

    public static int generateRandomNum() {
        return (int) Math.ceil(Math.random() * 100);
    }

    public static void playTheGame() {
        int random;
        int userGuess;

        random = HighLow.generateRandomNum();

        do {
            userGuess = HighLow.getUserGuess();
            try {
                if ( (userGuess > 1) && (userGuess < 100) ) {
                    if (userGuess > random) {
                        System.out.println("Lower, try again!");
                    } else if (userGuess < random) {
                        System.out.println("Higher, try again!");
                    }
                } else {
                    throw new IllegalArgumentException("Error! number out of range, try again with a number between 1 and 100!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (userGuess != random);
        System.out.println("Good Guess, you got it!");

    }

    public static int getUserGuess() {
        int userInput;
        try {
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                return userInput;
            } else {
                throw new InputMismatchException("Error! Invalid input, try again.");
            }
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println(e.getMessage());
            return getUserGuess();
        }

    }

}
