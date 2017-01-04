import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 12/19/16.
 */

public class Stringy {

    public static StringBuffer stringBasics() {

        StringBuffer message = new StringBuffer("We don't need no education");
        message.append("\nWe don't need no thought control");
        message.append("\nCheck \"this\" out! \"s inside of \"s!");
        message.append("\nIn Windows, the main drive is usually C:\\");
        message.append("\nI can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!");

        return message;
    }

    public static void main(String[] args) {
        System.out.println("working with strings!");
        StringBuffer result = Stringy.stringBasics();
        System.out.println(result);

        System.out.println("pig latin exercise");
        String response = "yes";
        String word;
        String translated;
        String startString;
        String endString;
        char c;
        //need to use Class type Character instead of primitive type char when using Arrays.aslist
        //b/c .asList works on object types but not primitive!
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int start = 0;
        int firstVowel = 0;
        int end;

        System.out.println("Translate words to pig latin!");
        do {
            System.out.println("Enter a word: ");
            Scanner sc = new Scanner(System.in);
            word = sc.nextLine();
            end = word.length();

            for (int i = 0; i < end; i++) {
                c = Character.toLowerCase(word.charAt(i));
                if(Arrays.asList(vowels).contains(c)) {
                    firstVowel = i;
                    break;
                }
            }

            if (start != firstVowel) {
                startString = word.substring(firstVowel, end);
                endString = word.substring(start, firstVowel);
                translated = startString + endString + "ay";

            } else {
                translated = word + "way";
            }

            System.out.println(word + " in pig Latin is " + translated);
            System.out.println("pig Latin-ize another word? (yes/no)");
            response = sc.nextLine();

        } while ("yes".equalsIgnoreCase(response));

        System.out.println("oodgay ebyay!");
    }

}
