import java.util.ArrayList;
import java.util.List;
public class Main1 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add(15);
        mylist.add(23);
        mylist.add(56);
        mylist.add(72);

        mylist.remove(1);
        System.out.println(mylist);
    }
}
// Above is an example on how to remove an element from  a list.