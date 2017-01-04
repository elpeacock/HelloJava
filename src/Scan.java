/**
 * Created by user on 12/15/16.
 */
public class Scan {

    public static void main(String[] args) {
        String response = "yes";
        double length;
        double width;
        double area;
        double perimeter;

        System.out.println("Scanner class exercises");
        System.out.println("Let's measure the rooms!!");

        do {
            System.out.println("Enter the length: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            length = sc.nextDouble();

            System.out.println("Enter the width: ");
            width = sc.nextDouble();

            area = length * width;
            System.out.println("The area of this room is: " + area);

            perimeter = 2 * length + 2 * width;
            System.out.println("The perimeter of this room is: " + perimeter);

            // make sure not to skip the next line - when going from nextInt() or nextDouble() there is a new line
            // character at the end that skips into nextLine(), so you have to discard that by calling nextLine()
            // before pulling the actual input you want
            sc.nextLine();

            System.out.println("Do you want to measure another room? yes/no: ");
            response = sc.nextLine();

        } while("yes".equalsIgnoreCase(response));

        System.out.println("ok, goodbye!");
    }

}
