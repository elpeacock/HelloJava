/**
 * Created by user on 1/16/17.
 */
public class Movie implements Comparable <Movie> {
    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public static String chooseCategory(OOValidator validate) {
        int categoryNumber = validate.getIntWithinRange("Please choose the number, 1 thru 6, that corresponds with " +
                "your chosen genre category", 1, 6);

        switch (categoryNumber) {
            case 1:
                return "animated";
            case 2:
                return "drama";
            case 3:
                return "horror";
            case 4:
                return "scifi";
            case 5:
                return "comedy";
            case 6:
                return "musical";
        }

        return null;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        int compareTitles = title.compareToIgnoreCase(otherMovie.title);

        return compareTitles;
    }
}
