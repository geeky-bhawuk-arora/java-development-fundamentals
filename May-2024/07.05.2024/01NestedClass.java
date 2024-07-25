
class demo {

    private int a = 100;

    void show() {
        System.out.println("Hallo Bhawuk!");
    }

    class xyz {

        int b = 200;

        void display() {
            show();
            System.out.println("Sehr Gut Bhawuk!");
        }

        class pqr {

            int c = 300;

            void publish() {
                System.out.println("Guten Abend, Bhawuk!");
            }
        }
    }

    public static void main(String args[]) {
        demo a1 = new demo();
        demo.xyz a2 = a1.new xyz();
        System.out.println(a2.b);
        demo.xyz.pqr a3 = new demo().new xyz().new pqr();
        System.out.println(a3.c);
    }
}
