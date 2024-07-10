// Demonstrating and resolving a concurrency problem where multiple threads modify a shared variable without synchronization, leading to unpredictable results.

class abc extends Thread {
    static int count = 0;

    public void run() {
        count++;
    }

    public static void main(String[] args) {
        // Concurrency Problem
        System.out.println(count);
        abc a1 = new abc(); // Main Thread
        a1.start();
        while (a1.isAlive()) {
            System.out.println("Wait..");
        }
        System.out.println(count);
        count++;
        System.out.println(count);
    }
}