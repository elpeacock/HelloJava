/**
 * Created by user on 12/20/16.
 */
public class Factorialize {
    public static long regularStyle (int x){
        int i,fact = 1;

        for(i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
