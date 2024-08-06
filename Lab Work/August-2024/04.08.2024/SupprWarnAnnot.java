import java.util.*;

class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Bhawuk");
        list.add("Bhawu");
        list.add("Bhaw");

        for(Object obj: list) {
            System.out.println(obj);
        }
    }
}