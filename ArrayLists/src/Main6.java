import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Toyota");
        for (int i = 0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
// Above is an example on how to loop through an arraylist.