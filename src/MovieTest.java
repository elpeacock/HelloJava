import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by user on 1/16/17.
 */
public class MovieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOValidator validate = new OOValidator(sc);
        ArrayList <Movie> movies = new ArrayList<>();
        String response;

        // populate the ArrayList with the movie titles/categories from MovieIO
        for (int i = 1; i <= 100; i++) {
            Movie movieInfo = MovieIO.getMovie(i);
            movies.add(movieInfo);
        }

        System.out.println("Welcome to the movie picker!");
        System.out.println("");

        do {
            System.out.println("****************************************");
            System.out.println("*             Category List            *");
            System.out.println("****************************************");
            System.out.printf("Number         | Category \n");
            System.out.println("****************************************");
            System.out.printf("%1$-15s %2$-10s", 1, "animated \n");
            System.out.printf("%1$-15s %2$-6s", 2, "drama \n");
            System.out.printf("%1$-15s %2$-7s", 3, "horror \n");
            System.out.printf("%1$-15s %2$-6s", 4, "scifi \n");
            System.out.printf("%1$-15s %2$-7s", 5, "comedy \n");
            System.out.printf("%1$-15s %2$-10s", 6, "musical \n");
            System.out.println("****************************************");

            Collections.sort(movies);
            String category = Movie.chooseCategory(validate);

            System.out.println("The " + category + " movies we have are: ");
            for (Movie movie : movies) {
                if (category.equalsIgnoreCase(movie.getCategory())) {
                    System.out.println(movie.getTitle());
                }
            }
            System.out.println("");
            response = validate.getChoiceString("Pick another movie? (enter y/n)", "y", "n");

        } while (response.equalsIgnoreCase("y"));

        System.out.println("thanks for using the movie picker! enjoy your movie night!");

    }
}
