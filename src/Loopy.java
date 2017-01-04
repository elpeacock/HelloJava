import java.util.Scanner;

/**
 * Created by user on 12/15/16.
 */
public class Loopy {

    public static void main(String[] args) {
        //while loop
        int i = 5;

        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        //do-whiles
        int a = 0;

        System.out.println("print even numbers from 0-100");
        do {
            a += 2;
            System.out.println(a);
        } while (a < 100);

        int b = 100;

        System.out.println("count from 100 to -10 by fives");
        do {
            System.out.println(b);
            b -= 5;
        } while (b >= -10);

        long x = 2l;

        System.out.println("Print list of perfect squares less than 1000000");
        do {
            System.out.println(x);
            x *= x;
        } while (x < 1000000);

        //for loops
        int c;

        System.out.println("evens from 0-100 with a for loop");
        for (c = 0; c <= 100; c += 2) {
            System.out.println(c);
        }

        int d;

        System.out.println("count from 100 to -10 by fives with a for loop");
        for (d = 100; d >= -10; d -= 5) {
            System.out.println(d);
        }

        long e;

        System.out.println("list of perfect squares up to 1000000 with a for loop");
        for (e = 2l; e <= 1000000; e *= e) {
            System.out.println(e);
        }

        //FizzBuzz
        int f;

        for (f = 1; f <= 100; f += 1) {
            if ((f % 3 == 0) && (f % 5 == 0)) {
                System.out.println("fizzBuzz!");
            } else if (f % 3 == 0) {
                System.out.println("fizz!");
            } else if (f % 5 == 0) {
                System.out.println("buzz!");
            } else {
                System.out.println(f);
            }
        }

        //Powers

        int g;
        int guess;
        String response = "yes";

        System.out.println("I will maths you a list of squares and cubes up to your given integer");
        do {
            System.out.println("Enter an integer: ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            System.out.println("Even Squares between 1 and " + guess + " are: ");
            for (g = 1; g * g < guess; g++) {
                System.out.print(g * g + " ");
            }
            System.out.println(" ");

            System.out.println("Even Cubes between 1 and " + guess + " are: ");
            for (g = 1; Math.pow(g, 3) < guess; g++) {
                System.out.print((int) Math.pow(g, 3) + " ");
            }
            System.out.println(" ");
            System.out.println("Do you want to find more squares/cubes? (yes/no): ");
            response = sc.next();
            sc.nextLine();
        } while ("yes".equalsIgnoreCase(response));

        System.out.println ("See ya later, Alligator");

        // Percentage to Letter Grades
        // the number percentage user gives
        int numberGrade;
        // response for do while loop
        String convertAnotherGrade = "yes";
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
            convertAnotherGrade = sc.next();
            sc.nextLine();

        } while ("yes".equalsIgnoreCase(convertAnotherGrade));

        System.out.println("see ya later");

    }










}
