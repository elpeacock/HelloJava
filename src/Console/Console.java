package Console;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 1/9/17.
 */
public class Console {
    /* declares the scanner object */
    public Scanner sc;

    /* instantiates the Scanner object */
    public Console (Scanner sc) {
        this.sc = sc;
    }

    // output functions

    /**
     * This method will output a given message to the user
     * WITHOUT a new line character at the end
     *
     * use it like so:
     * <code>
     *     print("Hello, how are you today?")
     * </code>
     *
     * @param s the message to output to the user
     * @return type void: can return any data type passed into the function
     *
     */
    public void print(String s) {
        System.out.print(s);
    }

    /**
     * This method will output a given message to the user
     * WITH a new line character at the end
     *
     * use it like so:
     * <code>
     *     println("Hello, how are you today?");
     * </code>
     *
     * @param s the message to output to the user
     * @return type void: can return any data type passed into the function
     *
     */
    public void println(String s) {
        System.out.println(s);
    }

    /**
     * This method will output a new blank line
     *
     * use it like so:
     * <code>
     *     println();
     * </code>
     *
     * @return type void: returns an empty new line
     *
     */
    public void println() {
        System.out.println();
    }

    // input functions

    /**
     * This method checks for and validates user input
     * checks for valid integer input
     *
     * use it like so
     * <code>
     *     getInt("Please enter an integer");
     * </code>
     *
     * @param prompt is a string passed into the method that asks the user a question
     * @return type integer.
     */
    public int getInt(String prompt) {
        println(prompt);
        int checkInt;
        try {
            if(sc.hasNextInt()){
                checkInt = sc.nextInt();
                return checkInt;
            } else {
                throw new InputMismatchException("Error! Invalid input, try again.");
            }
        } catch (InputMismatchException e) {
            sc.next(); /* discard incorrect value */
            System.out.println(e.getMessage());
            return getInt(prompt);
        }
    }

    /**
     * This method validates user input for a valid integer that lies within a given range
     *
     * use it like this:
     * <code>
     *     getIntWithinRange("Please enter an integer between 1 and 10", 1, 10)
     * </code>
     *
     * @param prompt is a string passed into the method that asks a user a question
     * @param min is an integer value passed into the method that defines the lower bound of the given range
     * @param max is an integer value passed into the method that defines the upper bound of the given range
     *
     * @return type integer.
     */
    public int getIntWithinRange(String prompt, int min, int max) {
        int checkRange;
        try {
            checkRange = getInt(prompt);
            if ((checkRange < min) || (checkRange > max)) {
                throw new IllegalArgumentException("Error! Integer input must be between " + min + " and " + max + ", try again.");
            }
            return checkRange;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

    }

    /**
     * This method checks for and validates user input for data type double
     *
     * use it like this
     * <code>
     *     getDouble("enter any number between .999999 and 10.0")
     * </code>
     *
     * @param prompt a string that is passed into the method that asks the user a question
     *
     * @return type double
     */
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

    /**
     * This method validates user input and makes sure that the given number
     *      1.) is a double
     *      2.) is within a given range
     *
     * use it like this
     * <code>
     *     getDoubleWithinRange("please enter any number between .99999 and 10.0", .99999, 10.0)
     * </code>
     *
     * @param prompt a string that is passed into the method and asks the user a question
     * @param min a double that is passed into the method as the lower bound of the given range
     * @param max a double that is passed into the method as the upper bound of the given range
     *
     * @return type double
     */
    public double getDoubleWithinRange(String prompt, int min, int max) {
        double checkDoubleRange;
        try {
            checkDoubleRange = getDouble(prompt);
            if ((checkDoubleRange < min) || (checkDoubleRange > max)) {
                throw new IllegalArgumentException("Error! Input must be any number between " + min + " and " + max + ", try again.");
            }
            return checkDoubleRange;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getDoubleWithinRange(prompt, min, max);
        }

    }

    /**
     * this method checks for empty user input
     *
     * use it like this
     * <code>
     *     getRequiredString("What is your favorite color?")
     * </code>
     *
     * @param prompt a string that is passed into the method
     *
     * @return type String
     */
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

    /**
     * this method checks if user input is one of two valid options
     *
     * use it like this
     * <code>
     *     getChoiceString("do you want to continue? enter yes or no", "yes", "no")
     * </code>
     *
     * @param prompt a String passed into the method that asks the user to choose between two options
     * @param s1 a String passed into the method that defines the first option
     * @param s2 a String passed into the method that defines the second option
     *
     * @return type String
     */
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
