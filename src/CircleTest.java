import java.util.Scanner;

/**
 * Created by user on 1/16/17.
 */
public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOValidator validate = new OOValidator(sc);

        String response;
        double radius;

        System.out.println("Welcome to the circle calculator!");

        do {
            radius = validate.getDouble("Please enter the radius of the circle: ");
            Circle circle = new Circle(radius);
            System.out.println("The circumference of a circle with the radius of " + radius + " is: " + circle
                    .getFormatttedCircumference());
            System.out.println("The area of a circle with the radius of " + radius + " is: " + circle
                    .getFormattedArea());
            System.out.println("So far, you have calculated " + circle.getHowManyCircles() + " circle(s).");
            response = validate.getChoiceString("Calculate another circle? (enter y or n)", "y", "n");
        } while (response.equalsIgnoreCase("y"));
        System.out.println("Thank you for using the circle calculator, you calculated " + Circle.getHowManyCircles()
                + " circle(s).");
    }
}
