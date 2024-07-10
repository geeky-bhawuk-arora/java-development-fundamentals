
import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("Bhawuk", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher("Bhawuk Arora (Bhawuk)");
        boolean res = m1.find();
        System.out.println(res);
        System.out.println(Pattern.matches("...s", "amms")); // . represents a single letter
        System.out.println(Pattern.matches("[amn]", "a")); // Grouping
    }
}
