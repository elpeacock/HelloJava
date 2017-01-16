import java.util.*;

/**
 * Created by user on 1/11/17.
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOValidator validate = new OOValidator(sc);
        List <Student> students = new ArrayList();

        String response;

        do {
            String first = Student.studentFirstName(validate);
            String last = Student.studentLastName(validate);
            int grade = Student.studentScore(validate);

            Student student = new Student(first, last, grade);

            students.add(student);
            response = validate.getChoiceString("enter another student? (enter y or n)", "y", "n");
        } while (response.equalsIgnoreCase("y"));


        System.out.println("there are " + students.size() + " students in this list");
        Collections.sort(students);
        for (Student person : students) {
            System.out.println(person.getFullName() + " received a score of " + person.getScore());
        }

    }

}
