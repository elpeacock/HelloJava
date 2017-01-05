import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 1/4/17.
 */
public class OOValidator {
    public Scanner sc;

    public OOValidator(Scanner sc) {
        this.sc = sc;
    }

    public int getInt() {
        int checkInt;
        try {
            if(sc.hasNextInt()){
                checkInt = sc.nextInt();
                return checkInt;
            } else {
                throw new InputMismatchException ("Error! Invalid input, try again.");
            }
        } catch (InputMismatchException e) {
            sc.next(); /* discard incorrect value */
            System.out.println(e.getMessage());
            return getInt();
        }
    }

    public int getIntWithinRange(int min, int max) {
        int checkRange;
        try {
            checkRange = getInt();
            if ((checkRange < min) || (checkRange > max)) {
                throw new IllegalArgumentException("Error! Integer input must be between " + min + " and " + max + ", try again.");
            }
            System.out.println("Great Success! You have entered a valid integer within range!");
            return checkRange;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(min, max);
        }

    }

    public double getDouble() {
        double checkDouble;
        try {
            if(sc.hasNextDouble()){
                checkDouble = sc.nextDouble();
                return checkDouble;
            } else {
                throw new InputMismatchException ("Error! Invalid input, try again.");
            }
        } catch (InputMismatchException e) {
            sc.next(); /* discard incorrect value */
            System.out.println(e.getMessage());
            return getDouble();
        }
    }

    public double getDoubleWithinRange(int min, int max) {
        double checkDoubleRange;
        try {
            checkDoubleRange = getDouble();
            if ((checkDoubleRange < min) || (checkDoubleRange > max)) {
                throw new IllegalArgumentException("Error! Input must be any number between " + min + " and " + max + ", try again.");
            }
            System.out.println("Great Success! You have entered a valid number within range");
            return checkDoubleRange;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getDoubleWithinRange(min, max);
        }

    }
}
