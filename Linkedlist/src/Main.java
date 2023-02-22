import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
     LinkedList<String>clothes = new LinkedList<String>();
     clothes.add("Polo");
     clothes.add("Versace");
     clothes.add("Fendi");
     clothes.add("Louis Vitton");
     clothes.addFirst("Mark and Spencer");
        System.out.println(clothes);
    }
}

// Above we made use of the add first method to add the name of the product first.