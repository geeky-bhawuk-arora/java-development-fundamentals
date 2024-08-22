import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        Handler consoleHandler = null;
        Handler fileHandler = null;

        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler();

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.config("Configuration done.");

            LOGGER.log(Level.FINE, "Finer logged");

            // If you want to remove consoleHandler after logging FINE level message
            LOGGER.removeHandler(consoleHandler);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occurred in FileHandler", e);
        }

        LOGGER.log(Level.FINE, "Completed");
    }
}
