package folder;

class abc {

    int rollNum = 19;
    int age = 21;

    abc() {
        this(17,19);
        System.out.println("Hello Bhawuk!");
    }

    abc(int rollNum, int age) {
//        this();
        this.rollNum = rollNum;
        this.age = age;
    }

    public static void main(String args[]) {
        abc a1 = new abc(100, 42);
        System.out.println(a1.rollNum + " " + a1.age);
    }
}
