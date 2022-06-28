package Concurrency;

/**
 * Runnable is the interface whose run() is implemented by thread and then we
 * are overriding
 */
public class subClass extends Thread {

  @Override
  public void run() {
    System.out.println("Hello from the Subclass call");
  }

  public static void main(String[] args) throws InterruptedException {
    (new subClass()).start();

    /*
     * Sleep testing
     * In any case, you cannot assume that invoking sleep will suspend the thread
     * for precisely the time period specified.
     */
    String importantInfo[] = {
        "Mares eat oats",
        "Does eat oats",
        "Little lambs eat ivy",
        "A kid will eat ivy too"
    };

    for (int i = 0; i < importantInfo.length; i++) {
      // Pause for 4 seconds
      try {
        Thread.sleep(100000);
      } catch (InterruptedException e) {
        // We've been interrupted: no more messages.
        e.getStackTrace();
        System.out.println("INTERRUPTED!!");
        return;
      }
      // Print a message
      System.out.println(importantInfo[i]);
    }

    /*
     * The join method allows one thread to wait for the completion of another. If t is a Thread object whose thread is currently executing,

t.join();
causes the current thread to pause execution until t's thread terminates. Overloads of join allow the programmer to specify a waiting period. However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.

Like sleep, join responds to an interrupt by exiting with an InterruptedException.
     */
  }
}
