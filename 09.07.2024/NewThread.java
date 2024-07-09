// The other way to create a thread is to declare a class that implements the Runnable interface. That class then implements the run method. An instance of the class can then be allocated, passed as an argument when creating Thread, and started.

class NewThread implements Runnable {
    String name;
    Thread thread;

    NewThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("A new thread " + thread + " is created\n");
        thread.start(); // Schedules this thread to begin execution.
    }

    public void run() {
        try {
            for (int j = 5; j > 0; j--) {
                System.out.println(name + " : " + j);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(name + " thread interrupted.");
        }
        System.out.println(name + " thread running.");
    }
}

class NewThreadTest {
    public static void main(String[] args) {
        new NewThread("1st"); // Non-Daemon Thread
        new NewThread("2nd");
        new NewThread("3rd");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Interruption occurs in the Main Thread.");
        }
        System.out.println("We are exiting from Main Thread.");
    }
}
