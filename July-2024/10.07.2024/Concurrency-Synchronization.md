## Concurrency & Multithreading

- Java is a multi-threaded programming language which means we can develop multi-threaded programs using Java. 🖥️
- A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources, especially when your computer has multiple CPUs. 💻
- Multi-threading enables you to write in a way where multiple activities can proceed concurrently in the same program. 🧵

### Stages of the Life Cycle

- **New** − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread. 🌱
- **Runnable** − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task. 🏃
- **Waiting** − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing. ⏳
- **Timed Waiting** − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs. ⏲️
- **Terminated (Dead)** − A runnable thread enters the terminated state when it completes its task or otherwise terminates. ⚰️

### Thread Priorities

- Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled. 📅
- Java thread priorities are in the range between `MIN_PRIORITY` (a constant of 1) and `MAX_PRIORITY` (a constant of 10). By default, every thread is given priority `NORM_PRIORITY` (a constant of 5). 🏷️
- Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent. 🥇

### Concurrency

- The concurrency utilities include a high-performance, flexible thread pool; a framework for asynchronous execution of tasks; a host of collection classes optimized for concurrent access; synchronization utilities such as counting semaphores; atomic variables; locks; and condition variables. ⚙️

- [Java Concurrent Utilities](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/concurrent/package-summary.html) 📚

- [Java Concurrency Documentation](https://docs.oracle.com/en/java/javase/22/core/concurrency.html#GUID-59C16A2D-57CE-4C83-9D6F-91A48E01E3C6) 📖

### Thread Synchronization

- [Thread Synchronization Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html) 🔗
