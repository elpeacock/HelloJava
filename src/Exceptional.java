import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by user on 12/21/16.
 */
public class Exceptional {

    private static String[] studentNames = {"Finn Mertens", "Simon Petrikov", "Marceline Abadeer", "Bob Belcher", "Linda Belcher",
    "Sam Winchester", "Dean Winchester", "Jon Snow", "Arya Stark", "Cersei Lannister", "Captain Malcolm Reynolds", "Inara Serra"};

    private static int[] studentAge = {16, 1043, 1000, 45, 44, 33, 37, 21, 16, 43, 31, 25};

    private static String[] studentWhere = {"The Land of Ooo", "The Ice Kingdom", "The Nightosphere", "New Jersey", "New Jersey", "Lawrence, Kansas", "Lawrence, Kansas", "Winterfell", "Winterfell", "Casterly Rock", "Shadow", "Sihnon"};

    public static String inputName;

    public static int indexOfStudent;

    public static int enterNameOfStudent (Scanner sc) {

        System.out.println("List of students: ");
        for (int i = 0; i <= 11; i++) {
            System.out.println(studentNames[i]);
        }

        System.out.println("Please enter the name of the student you'd like information on: ");
        inputName = sc.nextLine();
        try {
            if (inputName.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be blank.");
            }
        } catch (IllegalArgumentException e) {
//        sc.next(); /* discard incorrect value */
            System.out.println(e.getMessage());
            return enterNameOfStudent(sc);
        }
        for (int i = 0; i <= 11; i++) {
                if (inputName.trim().equalsIgnoreCase(studentNames[i])) {
                    indexOfStudent = i;
                }

        }
        return indexOfStudent;
    }
    public static void getStudentInfo() {
        String name = studentNames[indexOfStudent];
        int age = studentAge[indexOfStudent];
        String where = studentWhere[indexOfStudent];
        System.out.println("Student " + name + " is " + age + " years old and is from " + where + "." );
    }

}


