import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main2 {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();

        mylist.add(45);
        mylist.add(67);
        mylist.add(34);
        mylist.add(56);
        mylist.add(82);

        Collections.sort(mylist);

        for (int i : mylist) {

            System.out.println(i);
        }
    }
}
// Above is the sorting method in.
