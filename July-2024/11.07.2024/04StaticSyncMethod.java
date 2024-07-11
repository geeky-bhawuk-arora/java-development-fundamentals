class Table {
    //  Static Synchronized method is also a method of synchronizing a method in Java such that no two threads can act simultaneously static upon the synchronized method. We are attaining a class-level lock such that only one thread will operate on the method. The Thread will acquire a class-level lock of a Java class, such that only one thread can act on the static synchronized method.
    static synchronized void printStaticTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {

    public void run() {
        Table.printStaticTable(10);  // Calling the static synchronized method
    }
}

class MyThread2 extends Thread {

    public void run() {
        Table.printStaticTable(200);  // Calling the static synchronized method
    }
}

class MyThread3 extends Thread {

    public void run() {
        Table.printStaticTable(400);  // Calling the static synchronized method
    }
}

class Test {
    public static void main(String args[]) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
