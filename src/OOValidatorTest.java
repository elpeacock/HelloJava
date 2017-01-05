import java.util.Scanner;

/**
 * Created by user on 1/4/17.
 */
public class OOValidatorTest {
    public static void main(String[] args) {
        int min = -100;
        int max = 100;
        String prompt = "please enter an integer between " + min + " and " + max + ".";
        String doublePrompt = "please enter any number between " + min + " and " + max + ".";
        OOValidator OOV = new OOValidator(new Scanner(System.in));
        System.out.println("Valid Integer Test");
        System.out.println(prompt);
        OOV.getIntWithinRange(min, max);
        System.out.println("Valid Double Test");
        System.out.println(doublePrompt);
        OOV.getDoubleWithinRange(min, max);

    }
}
