import java.util.ArrayList;
import java.util.Collections;

public class Main9 {
    public static void main(String[] args) {
        ArrayList <Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(67);
        myNumbers.add(68);
        myNumbers.add(90);
        myNumbers.add(56);
        myNumbers.add(85);
        myNumbers.add(67);

        Collections.sort(myNumbers);

        for (int i: myNumbers) {
            System.out.println(i);
        }
    }
}
// Above is an example on how to use the sort method in an arraylist also usimg integer.