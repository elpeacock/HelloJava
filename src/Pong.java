import javafx.geometry.Side;

import java.util.Scanner;

/**
 * Created by user on 1/5/17.
 */
public class Pong {
    public static final int WINNING_SCORE = 7;

    public static void main(String[] args) {
        int playerScore = 0;
        int cpuScore = 0;
        Scanner sc = new Scanner(System.in);

        do {
            // User turn
            Side playerSide = hitToSide(sc);
            Side cpuSide = chooseRandomSide();
            if (isGuessCorrect(playerSide, cpuSide)) {
                playerScore += 1;
            }
            showScores(playerScore, cpuScore);

            // CPU turn
            cpuSide = chooseRandomSide();
            playerSide = guessTableSide(sc);
            if (isGuessCorrect(playerSide, cpuSide)) {
                cpuScore += 1;
            }
            showScores(playerScore, cpuScore);

        } while (isGameOver(playerScore, cpuScore));

        if (isWinner(playerScore)) {
            System.out.println("Player won!!!");
        } else {
            System.out.println("CPU won!!!");
        }
        sc.close();
    }

    private static boolean isWinner(int playerScore) {
        return playerScore == WINNING_SCORE;
    }

    /**
     * A game is over if any of the players have `WINNING_SCORE` points
     */
    private static boolean isGameOver(int playerScore, int cpuScore) {
        return playerScore < WINNING_SCORE && cpuScore < WINNING_SCORE;
    }

    private static Side chooseRandomSide() {
        return Math.round(Math.random()) == 0 ? Side.LEFT : Side.RIGHT;
    }

    private static void showScores(int playerScore, int cpuScore) {
        System.out.println("Player score is " + playerScore + ", CPU score is " + cpuScore);
    }

    private static boolean isGuessCorrect(Side guess, Side correct) {
        return correct.equals(guess);
    }

    private static Side guessTableSide(Scanner sc) {
        String side;
        System.out.println("What side of the table is the ball going to? (left or right)");
        side = sc.next();
        return convertToSide(side);
    }

    private static Side hitToSide(Scanner sc) {
        System.out.println("What side of the table you would like to swing? (left or right)");
        String side = sc.next();
        return convertToSide(side);
    }

    private static Side convertToSide(String side) {
        return "left".equalsIgnoreCase(side) ? Side.LEFT : Side.RIGHT;
    }
}
