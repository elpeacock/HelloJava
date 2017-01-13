import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 1/13/17.
 */
public class collections {
    //collections lecture notes
    public static void main(String[] args) {

//        //arrayLists with types
//        ArrayList<Integer> listOfNumbers = new ArrayList<>();
//
//        //how to populate your array list
//        listOfNumbers.add(0, 1);
//        //or
//        listOfNumbers.add(2);
//        listOfNumbers.add(11);
//        listOfNumbers.add(22);
//        //this notation auto increments the index
//
//        //how to retrieve info from your array list
//        System.out.println(listOfNumbers.get(0));
//        System.out.println(listOfNumbers.get(1));
//        //as with arrays, if trying to get info about an index that doesn't exist an index out of bounds exception is
//        // thrown
////        System.out.println(listOfNumbers.get(4));
//
//        //removing items from array list
//        listOfNumbers.remove(1);
//
//        //how many items in array list
//        System.out.println("size of this array: " + listOfNumbers.size());
//
//        //enchanced for loop to iterate the arraylist
//        for (Integer number : listOfNumbers) {
//            System.out.println("number: " + number);
//        }
//
//        //clearning values from the array list
////        listOfNumbers.clear();

        //lists w/out types
        List listCSV = new ArrayList();

        //add elements the same way
        listCSV.add(0, 1997);
        listCSV.add("Ford");
        listCSV.add(true);
        listCSV.add(1234.50);
        listCSV.add(23L);

        for( int i = 0; i < listCSV.size(); i++) {
            System.out.println(listCSV.get(i));
        }

        // maps with lists
        List<Map> persons = new ArrayList();
        Map person = new HashMap();

        person.put("age", 26);
        person.put("name", "Fer");
        person.put("hair Color", "black");

        persons.add(person);
        Map anotherPerson = new HashMap();

        anotherPerson.put("age", 34);
        anotherPerson.put("name", "Ana");
        anotherPerson.put("hair Color", "blonde");

        persons.add(anotherPerson);

        for (Map student: persons) {
            System.out.println(student.get("name") + " is " + student.get("age") + " years old, hair color is: " +
                    student.get("hair Color"));
        }


    }
}
