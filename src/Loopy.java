import java.util.Scanner;

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

    //Powers
    public static void showMeThePowers() {
        int i;
        int guess;
        String response = "yes";

        System.out.println("I will maths you a list of squares and cubes up to your given integer");
        do {
            System.out.println("Enter an integer: ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            System.out.println("Even Squares between 1 and " + guess + " are: ");
            for (i = 1; i * i < guess; i++) {
                System.out.print(i * i + " ");
            }
            System.out.println(" ");

            System.out.println("Even Cubes between 1 and " + guess + " are: ");
            for (i = 1; Math.pow(i, 3) < guess; i++) {
                System.out.print((int) Math.pow(i, 3) + " ");
            }
            System.out.println(" ");
            System.out.println("Do you want to find more squares/cubes? (yes/no): ");
            response = sc.next();
            sc.nextLine();
        } while ("yes".equalsIgnoreCase(response));

        System.out.println ("See ya later, Alligator");
    }

    // Percentage to Letter Grades
    public static void letterGrades() {
        // the number percentage user gives
        int numberGrade;
        // response for do while loop
        String response = "yes";
        // holds the letter grade
        String letterGrade;

        System.out.println("I'll convert your grade percentage to a letter grade");
        do {
            System.out.println("Enter a percentage between 0 and 100: ");
            Scanner sc = new Scanner(System.in);
            numberGrade = sc.nextInt();

            // divide by 10 to get single #'s for cases
            int quotient = numberGrade / 10;
            switch(quotient) {
                case 10:
                    letterGrade = "A+";
                    break;
                case 9:
                    letterGrade = "A";
                    break;
                case 8:
                    letterGrade = "B";
                    break;
                case 7:
                    letterGrade = "C";
                    break;
                case 6:
                    letterGrade = "D";
                    break;
                default:
                    letterGrade = "F";

            }

            // modulus 10 for +/-
            int remainder = numberGrade % 10;
            switch(remainder) {
                case 0:
                case 1:
                case 2:
                case 3:
                    letterGrade += "-";
                    break;
                case 7:
                case 8:
                case 9:
                    letterGrade += "+";
            }


            System.out.println(numberGrade + " is a(n) " + letterGrade);
            System.out.println("convert another grade? (yes/no): ");
            response = sc.next();
            sc.nextLine();

        } while ("yes".equalsIgnoreCase(response));

        System.out.println("see ya later");

    }



}
