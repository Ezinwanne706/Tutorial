import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> accessories = new ArrayList<String>();
        accessories.add("Byc");
        accessories.add("Calvin");
        accessories.add("Fendi");
        accessories.set(1, "Watch");
        System.out.println(accessories);
    }
}
// Above is an illustration on how to change an element, and we do that by using the .set() mathod.