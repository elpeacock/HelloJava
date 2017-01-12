import java.util.Scanner;

/**
 * Created by user on 1/4/17.
 */
public class OOValidatorTest {
    public static void main(String[] args) {
        OOValidator OOV = new OOValidator(new Scanner(System.in));
        System.out.println("Valid Integer Test");
        OOV.getIntWithinRange("please enter an integer between -100 and 100 ", -100, 100);

        System.out.println("Valid Double Test");
        OOV.getDoubleWithinRange("please enter any number between -10.0 and 10.0", -10, 10);

        System.out.println("Valid String Test");
        OOV.getRequiredString("What is your favorite color?");

        System.out.println("Choose A String");
        OOV.getChoiceString("Which do you prefer: apple or banana?", "apple", "banana");

    }
}
