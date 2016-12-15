/**
 * Created by user on 12/15/16.
 */
public class Scan {

    public static void measureRooms() {
        String response = "yes";
        Double length;
        Double width;
        Double area;
        Double perimeter;

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

            System.out.println("Do you want to measure another room? yes/no: ");
            response = sc.next();
            sc.nextLine();

        } while("yes".equalsIgnoreCase(response));

        System.out.println("ok, goodbye!");
    }

}
