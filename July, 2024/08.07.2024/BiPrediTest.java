import java.util.function.BiPredicate; // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiPredicate.html

class BiPrediTest {
    public static void main(String[] args) {
        BiPredicate<Integer, String> b1 = (n,s) -> {
            if(n==Integer.parseInt(s))
                return true;
            return false;
        };
        System.out.println(b1.test(2,"3"));
    }
    
}
