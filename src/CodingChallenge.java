import java.util.Scanner;

/**
 * Created by user on 1/19/17.
 */
public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOValidator validate = new OOValidator(sc);


        problemNoOne(validate);

        String reverseCase = reverseCase("tu@kmiNi");
        System.out.println(reverseCase);

    }

    public static void problemNoOne (OOValidator validate) {
        String inputString = validate.getRequiredString("enter a word with a digit at the end");
        int startOfString = 0;
        int endOfString = inputString.length();
        int trailingDigit = endOfString - 1;
        String wordString = inputString.substring(startOfString, trailingDigit);
        String digitString = inputString.substring(trailingDigit, endOfString);
        int digit = Integer.parseInt(digitString);

        if (wordString.length() == digit) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static String reverseCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
