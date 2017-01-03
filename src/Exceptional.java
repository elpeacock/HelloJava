import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 12/21/16.
 */
public class Exceptional {

    private static String[] studentNames = {"Finn Mertens", "Simon Petrikov", "Marceline Abadeer", "Bob Belcher", "Linda Belcher",
    "Sam Winchester", "Dean Winchester", "Jon Snow", "Arya Stark", "Cersei Lannister", "Captain Malcolm Reynolds", "Inara Serra"};

//    private static int[] studentAge = {16, 1043, 1000, 45, 44, 33, 37, 21, 16, 43, 31, 25};

//    private static String[] studentWhere = {"The Land of Ooo", "The Ice Kingdom", "The Nightosphere", "New Jersey", "New Jersey", "Lawrence, Kansas", "Lawrence, Kansas", "Winterfell", "Winterfell", "Casterly Rock", "Shadow", "Sihnon"};

    public static String inputName;

    public static int indexOfStudent;

    public static int enterNameOfStudent (Scanner sc) throws InputMismatchException {

        System.out.println("List of students: ");
        for (int i = 0; i <= 11; i++) {
            System.out.println(studentNames[i]);
        }

        try {
            System.out.println("Please enter the name of the student you'd like information on: ");
            inputName = sc.next();
            if (inputName.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be blank.");
            }
            for (int i = 0; i <= 11; i++) {
                if ( inputName.trim().equalsIgnoreCase(studentNames[i]) ) {
                    indexOfStudent = Integer.parseInt(studentNames[i]);

                }
            }
        } catch (InputMismatchException e) {
            sc.next(); //discard incorrect value
            System.out.println("Oops! We don't have a student by that name, try again!");
            return enterNameOfStudent(sc);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return enterNameOfStudent(sc);
        }

        return indexOfStudent;

    }


}
