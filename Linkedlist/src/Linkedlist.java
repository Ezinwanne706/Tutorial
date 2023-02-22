import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String>cars = new LinkedList<String>();
        cars.add("Toyota");
        cars.add("KIA");
        cars.add("NISSAN");
        cars.add("Mazda");

        cars.addLast("Honda");

        System.out.println(cars);
    }
}
// Above is a shown explanation on how the add a data last