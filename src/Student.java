/**
 * Created by user on 1/11/17.
 */
class Student implements Comparable <Student> {

    private String firstName;
    private String lastName;
    private int score;

    Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public static String studentFirstName (OOValidator validate) {
        String firstName = validate.getRequiredString("Enter the Student's first name");

        return firstName;
    }

    public static String studentLastName (OOValidator validate) {
        String lastName = validate.getRequiredString("Enter the Student's last name");

        return lastName;
    }

    public static int studentScore (OOValidator validate) {
        int score = validate.getIntWithinRange("Enter the Student's score. Scores must be integer values between" +
                " 0 and 100", 0, 100);

        return score;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int compareLastNames = lastName.compareTo(otherStudent.lastName);

        if (compareLastNames != 0) {
            return compareLastNames;
        }
        return firstName.compareTo(otherStudent.firstName);
    }
}
