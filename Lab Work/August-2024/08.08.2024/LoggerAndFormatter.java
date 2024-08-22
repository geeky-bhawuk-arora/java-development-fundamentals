
import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test
{
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args)
    {
        Handler fileHandler = null;
        Formatter simpleFormatter = null;

        try
        {
            fileHandler = new FileHandler("./Test.formatter.log");
            simpleFormatter = new SimpleFormatter();

            LOGGER.addHandler(fileHandler);
            LOGGER.info("Finnest message: Logger with DEFAULT FORMATTER");

            fileHandler.setFormatter(simpleFormatter);
            fileHandler.setLevel(Level.ALL);

            LOGGER.setLevel(Level.ALL);
            LOGGER.finest("Finnest message: Logger with SIMPLE FORMATTER");
        }
        catch(IOException exception)
        {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
    }
}