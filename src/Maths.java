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

    public static float divisions (int x, int y) {
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
}
