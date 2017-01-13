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

    public String getfullName() {
        return firstName + " " + lastName;
    }

    public int getScore () {
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
