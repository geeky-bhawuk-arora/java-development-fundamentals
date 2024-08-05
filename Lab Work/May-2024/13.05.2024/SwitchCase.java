
public class SwitchCase {

   enum Days {
        Mon, Tues, Wed, Thurs, Fri, Sat;
    }

    public static void main(String[] args) {
        int a = 321;
        char ch = 'A';
        String str = "Bhawuk";

        Days d = Days.Mon;

        switch (a) {
            case 221:
                System.out.println("Hallo Bhawuk!");
                break;

            case 231:
                System.out.println("Guten Abend, Bhawuk!");
                break;

            case 123:
                System.out.println("Ich bin Bhawuk!");
                break;

            default:
                System.out.println("Danke!");
                break;
        }

        switch (Days.Mon) {
            case Mon:
                System.out.println("Monday");
                break;

            default:
                System.out.println("Tschuss!");
                break;
        }

        if (a == 123) {
            d = Days.Mon;
        }
        else if (a == 321) {
            d = Days.Tues;
        }

        switch (d) {
            
            default:
                System.out.println("Tschuss!");
                break;
                
            case Mon:
                System.out.println("Monday");
                break;

            
        }
    }
}
