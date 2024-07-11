class Publish {
    public synchronized void display(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }
}

class NewThread extends Thread {
    Publish p;
    String name;

    NewThread(Publish obj, String str) {
        this.p = obj;
        this.name = str;
    }

    public void run() {
        p.display(name);
    }
}

class StaticSyncTest {
    public static void main(String[] args) {
        Publish p1 = new Publish();
        Publish p2 = new Publish();

        NewThread t1 = new NewThread(p1, "Java");
        NewThread t2 = new NewThread(p2, "Spring");
        NewThread t3 = new NewThread(p1, "JDBC");
        NewThread t4 = new NewThread(p2, "Hibernate");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}