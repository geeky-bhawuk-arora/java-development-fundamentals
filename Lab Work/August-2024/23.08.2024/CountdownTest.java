// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Timer.html
// https://www.geeksforgeeks.org/daemon-thread-java/

import java.util.TimerTask;
import java.util.Timer;

public class CountdownTest {
    Timer t;

    public CountdownTest(int seconds) {
        t = new Timer();
        t.schedule(new Test(), seconds * 1000); // Schedules the specified task for execution after the specified delay.
    }

    class Test extends TimerTask {
        public void run() {
            System.out.println("Countdown finished!");
            t.cancel(); // Terminates this timer, discarding any currently scheduled tasks.
        }
    }

    public static void main(String[] args) {
        new CountdownTest(5);
        System.out.println("Countdown started!");
    }
}