// Performing two tasks by two threads

class Sample1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}

class Sample2 extends Thread {
    public void run() {
        System.out.println("Task 2");
    }
}

class TestMultitasking2 {
    public static void main(String[] args) {
        Sample1 t1 = new Sample1();
        Sample2 t2 = new Sample2();

        t1.start();
        t2.start();
    }
}