import java.util.ArrayList;
import java.util.Collections;
public class Main8 {
    public static void main(String[] args) {
        ArrayList<String> watches = new ArrayList<>();
        watches.add("Swatch");
        watches.add("Rolex");
        watches.add("Gshock");
        watches.add("Micheal cors");

        Collections.sort(watches);

        for(String i : watches){
            System.out.println(i);
        }
    }
}
// Above is an example on how to sort an arraylist in a String method by using the sort() method and also using the import java.util. collections.
