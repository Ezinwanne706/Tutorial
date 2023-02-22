import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mistibushi");
        cars.remove(1);
        System.out.println(cars);
    }
}
//Above is an explanation on how to delete an elemant and we do that using the .remove medthod.
