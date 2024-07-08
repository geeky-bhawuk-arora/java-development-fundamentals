import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer; // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiConsumer.html

class BiConsuTest {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(10);

        List<Integer> l2 = new ArrayList<>();
        l2.add(20);
        l2.add(40);
        l2.add(60);
        l2.add(80);
        l2.add(100);

        BiConsumer<List<Integer>, List<Integer>> b1 = (fl, sl) -> {
            if (fl.size() != sl.size()) {
                System.out.println("Not matched");
            } else {
                for (int i = 0; i < fl.size(); i++) {
                    if (!fl.get(i).equals(sl.get(i))) {
                        System.out.println("Values not matched");
                    } else {
                        System.out.println("Values matched");
                    }
                }
            }
        };
        b1.accept(l1, l2);
    }
}
