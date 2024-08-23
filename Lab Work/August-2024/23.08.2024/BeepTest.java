import java.util.Timer;
import java.awt.Toolkit;
import java.util.TimerTask;

public class BeepTest {
    Toolkit tk;
    Timer t;

    public BeepTest() {
        tk = Toolkit.getDefaultToolkit();
        t = new Timer();
        t.schedule(new Test(), 0, 1 * 1000); // Schedules the specified task for execution after the specified delay.
    }

    class Test extends TimerTask {
        int beep = 3;

        public void run() {
            if (beep > 0) {
                tk.beep();
                System.out.println("Beep...!");
                beep--;
            } else {
                tk.beep();
                System.out.println("Beep...! Last one!");
                System.exit(0);
            }
        }
    }
}
