import java.util.Scanner;

/**
 * Created by user on 12/20/16.
 */
public class Factorialize {
    public static long regularStyle (int x){
        int i,fact = 1;

        for(i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String response = "yes";
        System.out.println("Let's get maths-y: factorials!");
        do {
            System.out.println("enter a number between 1 and 10: ");
            Scanner sc = new Scanner (System.in);
            int x = sc.nextInt();
            sc.nextLine();

            if ( ( x >= 1) && ( x <= 10 ) ) {
                System.out.println( "factorial of " + x + " is " + Factorialize.regularStyle(x) );

                System.out.println( "find another factorial? (yes/no): ");
                response = sc.nextLine();
            } else {
                System.out.println( "that number is NOT between 1 and 10, try again!" );
            }
        } while (response.trim().equalsIgnoreCase("yes") );

        System.out.println( "ok. peace out girl scout!" );
    }
}
