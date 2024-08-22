import java.util.logging.Level;
import java.util.logging.Logger;

class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Logger Name: " + LOGGER.getName());
        LOGGER.warning("This can cause ArrayIndexOutOfBoundsException");

        int[] a = {1, 2, 3};
        int index = 4;
        LOGGER.config("Index is set to " + index);

        try {
            System.out.println(a[index]);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception occurred", e);
        }
    }
}
