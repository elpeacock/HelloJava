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
        System.out.println("Let's get maths-y");
        System.out.println("enter the first number");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();

        System.out.println( x + " plus " + y + " equals " + Maths.additions(x, y) );
        System.out.println( x + " minus " + y + " equals " + Maths.subtractions(x, y) );
        System.out.println( x + " times " + y + " equals " + Maths.multiplications(x, y) );
        System.out.println( x + " divided by " + y + " equals " + Maths.divisions(x, y) );
        System.out.println( "the remainder of " + x + " divided by " + y + " equals " + Maths.modulus(x, y) );

    }
}
