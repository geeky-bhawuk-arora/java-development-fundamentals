// One way to create a thread is to declare a class to be a subclass of Thread. This subclass should override the run method of class Thread. An instance of the subclass can then be allocated and started.

class ThreadTest extends Thread {
    public void run() {
        int a = 10;
        int b = 12;
        int res = a + b;
        System.out.println("Thread started running.");
        System.out.println("Sum of the numbers is " + res);
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start(); // Schedules this thread to begin execution.
    }
}