package folder;

public class NewClass {

    static int a = 100;

    void display() {
        System.out.println("Hello Bhawuk!");
    }

    int add(int x, int y) {
        this.display();
        return x + y;
    }

    public static void main(String[] args) {
        NewClass n1 = new NewClass();
        NewClass.a = 200;
        int sum = n1.add(12, 12);
        System.out.println(sum);

    }
}
