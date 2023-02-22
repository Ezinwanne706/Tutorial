
import java.util.Date;
public class Primitives {
        public static void main(String... args) {
            int i = 5;
            int j = 7;
            Date d = new Date();
            int result = add(i, j);
            System.out.print(result);
            d = null;
        }

        static int add(int a, int b) {
            String mess = new String("performing add ...");
            return a + b;
        }
    }

