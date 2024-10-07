import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecuteServTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            es.execute(() -> {
                System.out.println("Hallo");
            });

        }
        es.shutdown();

        try {
            if (!es.awaitTermination(300, TimeUnit.SECONDS)) {
                es.shutdownNow();
            }
        } catch (Exception e) {
            es.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
