import java.util.Scanner;

/**
 * Created by user on 1/18/17.
 */
public class RoshamboTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOValidator validate = new OOValidator(sc);
        String response;

        System.out.println("Welcome to the Roshambo App");
        // instantiate human player
        RoshamboPlayer human = new RoshamboHumanPlayer();
        human.setName(validate);
        int opponentChoice = RoshamboHumanPlayer.chooseAnOpponent(validate);

        // instantiate opponent based on human players choice
        RoshamboPlayer opponent;

        if (opponentChoice == 1) {
            opponent = new RoshamboRockPlayer();
            opponent.setName(validate);
        } else {
            opponent = new RoshamboComputerPlayer();
            opponent.setName(validate);
        }


        do {
            human.numberOfGamesPlayed++;
            System.out.println("1, 2, 3, SHOOT!");
            String myRoshambo = human.generateRoshambo(validate);
            String opponentRoshambo = opponent.generateRoshambo(validate);

            System.out.println(Roshambo.compareRoshambo(myRoshambo, opponentRoshambo, opponent, human));
            response = validate.getChoiceString("You have played " + human.numberOfGamesPlayed + " games. Play " +
                    "Again? (enter y or n)", "y", "n");
        } while (response.equalsIgnoreCase("y"));
        System.out.println("You played " + human.numberOfGamesPlayed + " games against " + opponent.getName()
                + ". You won " + human.gamesWon + " games, and " + opponent.getName() + " won " + opponent
                .gamesWon + " games.");
        System.out.println("goodbye! Thanks for playing!");
    }
}
