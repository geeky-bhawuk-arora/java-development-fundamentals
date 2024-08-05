// Performing single task by multiple threads

class TestMultitasking1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        TestMultitasking1 t1 = new TestMultitasking1();
        TestMultitasking1 t2 = new TestMultitasking1();
        TestMultitasking1 t3 = new TestMultitasking1();

        t1.start();
        t2.start();
        t3.start();
    }
}