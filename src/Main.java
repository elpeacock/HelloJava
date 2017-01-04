import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hello World
//        System.out.println("Hello World!");

        //Primitive Types
//        System.out.println("Primitive Data Types in Java");
//        Types.printByte();
//        Types.printShort();
//        Types.printInteger();
//        Types.printDouble();
//        Types.printLong();
//        Types.printFloat();
//        Types.printCharacter();
//        Types.printBool();

        //Scanner Class
//        System.out.println("Scanner Class Exercise");
//        Scan.measureRooms();

        //Loops
//        System.out.println("Loops and Control Structures");
//        Loopy.whileLoop();
//        Loopy.evens();
//        Loopy.fives();
//        Loopy.squares();
//        Loopy.forEvens();
//        Loopy.forFives();
//        Loopy.forSquares();
//        Loopy.fizzBuzz();
//        Loopy.showMeThePowers();
//        Loopy.letterGrades();

        //Strings
//        System.out.println("Strings y'all!");
//        StringBuffer result = Stringy.stringBasics();
//        System.out.println(result);
//        Stringy.pigLatin();

        //Methods
//        System.out.println("Let's get maths-y");
//        System.out.println("enter the first number");
//        Scanner sc = new Scanner (System.in);
//        int x = sc.nextInt();
//        System.out.println("enter the second number");
//        int y = sc.nextInt();
//
//        System.out.println( x + " plus " + y + " equals " + Maths.additions(x, y) );
//        System.out.println( x + " minus " + y + " equals " + Maths.subtractions(x, y) );
//        System.out.println( x + " times " + y + " equals " + Maths.multiplications(x, y) );
//        System.out.println( x + " divided by " + y + " equals " + Maths.divisions(x, y) );
//        System.out.println( "the remainder of " + x + " divided by " + y + " equals " + Maths.modulus(x, y) );
//        String response = "yes";
//        System.out.println("Let's get maths-y: factorials!");
//        do {
//            System.out.println("enter a number between 1 and 10: ");
//            Scanner sc = new Scanner (System.in);
//            int x = sc.nextInt();
//            sc.nextLine();
//
//            if ( ( x >= 1) && ( x <= 10 ) ) {
//                System.out.println( "coded regular-style: " );
//                System.out.println( "factorial of " + x + " is " + Factorialize.regularStyle(x) );
//
//                System.out.println( "find another factorial? (yes/no): ");
//                response = sc.nextLine();
//            } else {
//                System.out.println( "that number is NOT between 1 and 10, try again!" );
//            }
//        } while (response.trim().equalsIgnoreCase("yes") );
//
//        System.out.println( "ok. peace out girl scout!" );

//        int numOfSides;
//        int firstRoll;
//        int secondRoll;
//        String response = "yes";
//
//        do {
//            System.out.println("How many sides does your die have?");
//            Scanner sc = new Scanner(System.in);
//            numOfSides = sc.nextInt();
//            sc.nextLine();
//
//            firstRoll = RollDice.rollEmOut(numOfSides);
//            secondRoll = RollDice.rollEmOut(numOfSides);
//
//            System.out.println("You rolled " + firstRoll + " and " + secondRoll);
//            System.out.println("Roll Again? (yes/no): ");
//            response = sc.nextLine();
//
//        } while ( response.trim().equalsIgnoreCase("yes") );

        //throw catch exceptions
        String response = "yes";

        do {
            Scanner sc = new Scanner(System.in);
            Exceptional.enterNameOfStudent(sc);
            Exceptional.getStudentInfo();
            System.out.println("Get information on another student? (reply yes or no)");
            response = sc.nextLine();
        } while (response.equals("yes"));
    }
}
