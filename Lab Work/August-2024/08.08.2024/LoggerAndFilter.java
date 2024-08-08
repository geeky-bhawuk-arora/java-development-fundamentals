import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class Test implements Filter
{
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args)
    {
        LOGGER.setFilter(new Test());
        LOGGER.severe("This is SEVERE message");
        LOGGER.warning("This is important warning message");
    }

    @Override
    public boolean isLoggable(LogRecord record)
    {
        if(record == null)
            return false;

        String message = record.getMessage()==null?"":record.getMessage();

        if(message.contains("important"))
            return true;
        return false;
    }

}