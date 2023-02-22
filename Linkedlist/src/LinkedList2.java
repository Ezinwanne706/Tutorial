import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> myNumbers = new LinkedList<Integer>();
        myNumbers.add(56);
        myNumbers.add(76);
        myNumbers.add(85);
        myNumbers.add(43);
        myNumbers.add(75);
        myNumbers.add(3);
        myNumbers.removeLast();
        System.out.println(myNumbers);
    }
}
// Above is an explanation of how to remove the last number using the remove last method.