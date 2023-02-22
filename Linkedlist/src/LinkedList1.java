import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>sneakeers = new LinkedList<String>();
        sneakeers.add("Fendi");
        sneakeers.add("sketchers");
        sneakeers.add("Zara");
        sneakeers.add("All Stars");
        sneakeers.add("Polo");
        sneakeers.removeFirst();
        System.out.println(sneakeers);
    }
}

// Above is an explanation on how to remove the first data using the removeFirst method.
