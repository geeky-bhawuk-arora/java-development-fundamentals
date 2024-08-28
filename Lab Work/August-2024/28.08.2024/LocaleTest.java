
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Locale.html
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(
                locale.getDisplayCountry() + " " + locale.getDisplayLanguage() + " " + locale.getDisplayName());
        // Check the different methods available in the Locale package

        Locale enLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");
        System.out.println(enLocale.getDisplayLanguage(enLocale) + " " + enLocale.getDisplayLanguage(frLocale));

        Locale[] locales = { new Locale("en", "US"), new Locale("fr", "FR") };
        for (int i = 0; i < locales.length; i++) {
            String dispLang = locales[i].getDisplayName(locales[i]);
            System.out.println(locales[i].toString() + " " + dispLang);
        }

        
    }
}
