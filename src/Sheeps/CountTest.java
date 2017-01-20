package Sheeps;

/**
 * Created by user on 1/20/17.
 */
public class CountTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Counting alligators... ");
        System.out.println("");
        Countable alligator = new Alligator();
        CountUtil.count(alligator, 3);

        System.out.println("");
        System.out.println("Counting Sheeps... ");
        System.out.println("");
        Sheep blackie = new Sheep("Blackie");
        CountUtil.count(blackie, 2);
        System.out.println("");

        Sheep dolly = (Sheep) blackie.clone();
        dolly.setName("Dolly");
        CountUtil.count(dolly, 3);
        System.out.println("");

        blackie.resetCount();
        CountUtil.count(blackie, 1);
    }
}
