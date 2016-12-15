/**
 * Created by user on 12/15/16.
 */
public class Loopy {

    //while loop
    public static void whileLoop() {
        int i = 5;

        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
    }

    //do-whiles
    public static void evens() {
        int i = 0;

        do {
            i += 2;
            System.out.println(i);
        } while (i < 100);
    }

    public static void fives() {
        int i = 100;

        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);
    }

    public static void squares() {
        long x = 2l;

        do {
            System.out.println(x);
            x *= x;
        } while (x < 1000000);

    }

    //for loops
    public static void forEvens() {
        int i;

        for (i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void forFives() {
        int i;

        for (i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }
    }

    public static void forSquares() {
        long i;

        for (i = 2l; i <= 1000000; i *= i) {
            System.out.println(i);
        }
    }

    //FizzBuzz
    public static void fizzBuzz() {
        int i;

        for (i = 1; i <= 100; i += 1) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzBuzz!");
            } else if (i % 3 == 0) {
                System.out.println("fizz!");
            } else if (i % 5 == 0) {
                System.out.println("buzz!");
            } else {
                System.out.println(i);
            }
        }
    }

    

}
