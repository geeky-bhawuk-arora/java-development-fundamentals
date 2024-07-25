import java.util.Locale;

public class Hello {

    public static void main(String[] args) {
        Locale l1 = new Locale("EN","INDIA");
        Locale l2 = Locale.JAPAN;
        System.out.println(l1.getDisplayLanguage());
        System.out.println(l1.getDisplayCountry());
        System.out.println(l2.getDisplayLanguage());
        System.out.println(l2.getDisplayCountry());
        System.out.println("Hallo Bhawuk!");       
    }
    

}
