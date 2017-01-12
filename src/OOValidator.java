
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

    public int getInt(String prompt) {
        System.out.println(prompt);
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
            return getInt(prompt);
        }
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int checkRange;
        try {
            checkRange = getInt(prompt);
            if ((checkRange < min) || (checkRange > max)) {
                throw new IllegalArgumentException("Error! Integer input must be between " + min + " and " + max + ", try again.");
            }
            System.out.println("Great Success! You have entered a valid integer within range!");
            return checkRange;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
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
            return getDouble(prompt);
        }
    }

    public double getDoubleWithinRange(String prompt, int min, int max) {
        double checkDoubleRange;
        try {
            checkDoubleRange = getDouble(prompt);
            if ((checkDoubleRange < min) || (checkDoubleRange > max)) {
                throw new IllegalArgumentException("Error! Input must be any number between " + min + " and " + max + ", try again.");
            }
            System.out.println("Great Success! You have entered a valid number within range");
            return checkDoubleRange;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getDoubleWithinRange(prompt, min, max);
        }

    }

    public String getRequiredString(String prompt) {
        System.out.println(prompt);
        String input;
        try {
            input = sc.nextLine();
            if (input.trim().isEmpty()) {
                throw new InputMismatchException("Error! Input can't be empty, try again.");
            }
            return input;
        } catch (InputMismatchException e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getRequiredString(prompt);
        }
    }

    public String getChoiceString(String prompt, String s1, String s2) {

        String input = getRequiredString(prompt);

        try {
            if (input.equals(s1) || input.equals(s2)) {
                return input;
            } else {
                throw new Exception("Error! Input must be a valid response option, try again.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getChoiceString(prompt, s1, s2);
        }
    }
}
