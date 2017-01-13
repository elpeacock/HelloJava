import java.util.*;

/**
 * Created by user on 1/11/17.
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;

        List <Student> students = new ArrayList();

        OOValidator validate = new OOValidator(sc);
        do {
            String first = studentFirstName(validate);
            String last = studentLastName(validate);
            int grade = studentScore(validate);

            Student student = new Student(first, last, grade);

            students.add(student);
            response = validate.getChoiceString("enter another student? (enter y or n)", "y", "n");
        } while (response.equalsIgnoreCase("y"));


        System.out.println("there are " + students.size() + " students in this list");
        Collections.sort(students);
        for (Student person : students) {
            System.out.println(person.getfullName() + " received a score of " + person.getScore());
        }


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

}
