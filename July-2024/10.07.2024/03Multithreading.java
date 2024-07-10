// Performing two tasks by two threads using Anonymous Class

class TestMultitasking3 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Task 1");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Task 2");
            }
        };

        t1.start();
        t2.start();

    }
}