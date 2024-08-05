
import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("3.0"); // When object, then no error.
        
        bd1 = bd1.add(bd2);
        System.out.println(bd1);
        
        bd1 = bd1.subtract(bd2);
        System.out.println(bd1);
        
        bd1 = bd1.multiply(bd2);
        System.out.println(bd1);
        
        bd1 = bd2.divide(bd1);
        System.out.println(bd1);
        
        bd1 = bd1.pow(2);
        System.out.println(bd1);
        
        bd1 = bd1.negate();
        System.out.println(bd1);
        

    }
}
