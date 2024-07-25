
public class Info {

    public static void main(String[] args) {
        String a1 = new String("Hallo Bhawuk"); // String Pool
//        String a1 = "Hallo Bhawuk";
        String b1 = a1;
//        String b1 = new String("Hallo Bhawuk"); // Forceful object creation
        System.out.println(a1 == b1); // Case 1 -> T T, Case 2 -> F T  
        System.out.println(a1.equals(b1));
    }
}
