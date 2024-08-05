
class Box<T, S> {

    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T get1() {
        return t;
    }

    public S get2() {
        return s;
    }
}

public class MultiTypeGen {

    public static void main(String[] args) {
        Box<Integer, String> b1 = new Box<Integer, String>();
        b1.add(29, "Hallo Bhawuk!");
        System.out.println(b1.get1());
        System.out.println(b1.get2());
    }
}
