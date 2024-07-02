import java.util.function.*;

// Interface ka object nhi banata but kese karte
//functionl interface -> lambada exp sei banado, singfle bastarct function hei
// child sei oibject banado
// aninymous class uses karlo

class abc {
    public static void main(String[] args) {
        Function<Integer, Double> f1 = a -> a / 2.0;
        f1 = f1.compose(a -> 3 * a);
        System.out.println(f1.apply(70));
        f1 = f1.andThen(a -> 2 * a);
        Function<Integer, Integer> f2 = Function.identity();

    }
}