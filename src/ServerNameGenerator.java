import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 1/10/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] adjectives = {
                "cute", "ultra", "stereotyped", "shaky", "psychedelic", "annoying", "disastrous", "magnificent", "wholesale",
                "ashamed", "fabulous", "same", "miscreant", "gleaming", "bitter"
        };
        String [] nouns = {
                "cactus", "sky", "ducks", "visitor", "basin", "support", "trip", "statement", "bedroom", "zinc", "coat",
                "income", "dime", "shade", "underwear"
        };
        String anotherServer;

        System.out.println("Welcome to the Server Name Generator!");

        do {
            System.out.println("Your randomly generated server name is: " + adjectives[getRandomAdjective(adjectives)] +
                    " " + nouns[getRandomNoun(nouns)]);
            anotherServer = nameAnotherServer(sc);
        } while (anotherServer.equalsIgnoreCase("y"));
        System.out.println("Thank you for using the Server Name Generator! Goodbye!");
    }


    public static int getRandomAdjective (String [] adjectives) {
        return (int) Math.ceil(Math.random() * adjectives.length - 1);
    }

    public static int getRandomNoun (String [] nouns) {
        return (int) Math.ceil(Math.random() * nouns.length - 1);
    }

    public static String nameAnotherServer (Scanner sc) {

        String response;
        System.out.println("Generate another server name? (y or n)");

        try {
            response = sc.next();
            if ( (!response.equalsIgnoreCase("y") ) && (!response.equalsIgnoreCase("n") ) ) {
                throw new InputMismatchException("You have entered an invalid response, please enter y or n");
            }
            return response;
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return nameAnotherServer(sc);
        }
    }
}
