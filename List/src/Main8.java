import java.util.ArrayList;
import java.util.List;
public class Main8 {
    public static void main(String[] args) {
        List <String> mylist = new ArrayList<String>();
        mylist.add("Cars");
        mylist.add("Shoes");
        mylist.add("Cloths");
        mylist.add("Bags");
        mylist.add("Cards");
        for (int i = 0; i < mylist.size();i++){
            System.out.println(mylist.get(i));
        }
    }
}
// Above is an example on how to loop through a List.