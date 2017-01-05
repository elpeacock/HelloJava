import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

/**
 * Created by user on 12/19/16.
 */
public class Maths {

    public static int additions (int x, int y) {
        if ( checkNumeric(x, y) ) {
            return x + y;
        }
        return 0;
    }

    public static int subtractions (int x, int y) {
        if ( checkNumeric(x, y) ) {
            return x - y;
        }
        return 0;
    }

    public static int multiplications (int x, int y) {
        if ( checkNumeric(x, y) ){
            return x * y;
        }
        return 0;
    }

    public static double divisions (int x, int y) {
        if ( checkNumeric(x, y) ) {
            if ( divideByZero(y) ) {
                return x / y;
            }

        }
        return 0;
    }

    public static int modulus (int x, int y) {
        checkNumeric(x, y);
        divideByZero(y);
        return x % y;
    }

    public static boolean checkNumeric (int x, int y) {
        if ( (isNumber (x) ) && (isNumber (y) ) ) {
            return true;
        } else {
            System.out.println("you gotta enter numbers to get maths-y!");

            if ( !isNumber (x) ) {
                System.out.println( x + "is not a number!");
            } if ( !isNumber (y) ) {
                System.out.println( y + "is not a number!");
            }
        }
        return false;
    }

    public static boolean divideByZero (int y) {
        if (y != 0) {
            return true;
        } else if ( !isNumber (y) ) {
            System.out.println( y + "is not a number!");
            return false;
        } else {
            System.out.println("you can't divide by zero, bro!");
            return false;
        }
    }

    public static void main(String[] args) {
        String response = "yes";
        System.out.println("Let's get maths-y");
        do {
            System.out.println("enter the first number");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("enter the second number");
            int y = sc.nextInt();

            System.out.println(x + " plus " + y + " equals " + Maths.additions(x, y));
            System.out.println(x + " minus " + y + " equals " + Maths.subtractions(x, y));
            System.out.println(x + " times " + y + " equals " + Maths.multiplications(x, y));
            System.out.println(x + " divided by " + y + " equals " + Maths.divisions(x, y));
            System.out.println("the remainder of " + x + " divided by " + y + " equals " + Maths.modulus(x, y));
            // drop the exterraneous new line char from nextInt so that the scanner doesn't skip
            sc.nextLine();
            System.out.println("Do you want to math some more numbers? (type yes or no)");
            response = sc.nextLine();
        } while ("yes".equalsIgnoreCase(response));

    }
}
