
public class NewTest {

    public static void main(String[] args) {
        String a1 = new String("Hallo Bhawuk");
        String b1 = "Hallo Bhawuk";
//        String c1 = "Hallo Bhawuk";
        String c1 = b1.intern();

        System.out.println(a1 == b1);
        System.out.println(b1 == c1);
        System.out.println(c1 == a1);
    }
}
