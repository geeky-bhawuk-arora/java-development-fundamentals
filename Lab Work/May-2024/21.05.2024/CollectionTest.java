
import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Hallo");
        l2.add("Bhawuk");

        for (String s1 : l2) {
            System.out.println(s1);
        }

        String name = (String) l2.get(0);

        List l1 = new ArrayList();
        l1.add("42");
        l1.add("19");
        l1.add("29");
        System.out.println(l1.get(0));

        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
