
import java.math.BigDecimal;

public class Test2 {

    public static void main(String[] args) {
        int a = 0;

        Outer:
        for (int i = 0; i < 2; i++) {
            System.out.println(i);

            Inner:
            for (int j = 0; j < 11; j++) {
                a += j;
                System.out.println(j + " " + a);
                if (a == 15) {
                    System.out.println("Danke!");
//                    break Outer;
                    continue Outer;
                }
            }
        }
    }
}
