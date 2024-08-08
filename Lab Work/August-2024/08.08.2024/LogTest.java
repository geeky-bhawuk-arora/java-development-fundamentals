// https://docs.oracle.com/en/java/javase/11/core/java-logging-overview.html#GUID-B83B652C-17EA-48D9-93D2-563AE1FF8EDA
// https://docs.oracle.com/en/java/javase/11/docs/api/java.logging/java/util/logging/package-summary.html

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogManager;

class Test {
    private final static Logger obj1 = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void testLogMsg () {
        obj1.log(Level.INFO, "Log Message 1");
    }
}

public class LogTest {
    public static void main(String[] args) {
        Test obj2 = new Test();
        obj2.testLogMsg();

        LogManager lm = LogManager.getLogManager();
        Logger obj3 = lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
        obj3.log(Level.INFO, "Log Message 2");
    }
}
