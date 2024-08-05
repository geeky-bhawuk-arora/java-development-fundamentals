import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task [" + name + "] executed on : " +
                LocalDateTime.now().toString());
    }
}

class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // newFixedThreadPool(2);
        // newCachedThreadPool();
        // newScheduledThreadPool(3);
        // newWorkStealingPool();
        // newSingleThreadExecutor();
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            executor.execute(task);
        }
        shutdownAndAwaitTermination(executor);
    }

    static void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown();
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (InterruptedException ex) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
