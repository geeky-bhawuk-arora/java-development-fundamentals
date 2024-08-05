// Performing two tasks by two threads by implementing Runnable and using Anonymous Class

class TestMultitasking4 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Task 1");
            }
        };
        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("Task 1");
            }
        };

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

    }
}