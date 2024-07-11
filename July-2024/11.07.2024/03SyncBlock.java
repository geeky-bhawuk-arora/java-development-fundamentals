class Gmail {
    public void SendMail(String msg) {
        System.out.println("Sending a message: " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Successfully Sent");
    }
}

class RCAT extends Thread {
    String msg;
    Gmail g1;

    RCAT(String str, Gmail obj) {
        msg = str;
        g1 = obj;
    }

    public void run() {
        synchronized (g1) {
            g1.SendMail(msg);
        }
    }
}

class SyncBlockTest {
    public static void main(String[] args) {
        Gmail g = new Gmail();
        RCAT r1 = new RCAT("Hallo Bhawuk!", g);
        RCAT r2 = new RCAT("Danke!", g);

        r1.start();
        r2.start();
        // The join method allows one thread to wait for the completion of another. If t is a Thread object whose thread is currently executing, t.join(); causes the current thread to pause execution until t's thread terminates.
        try {
            r1.join();
            r2.join();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}