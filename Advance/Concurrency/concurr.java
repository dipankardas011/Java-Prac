package Concurrency;

/**
 * Runnable is the interface whose run() is implemented
 */
public class concurr implements Runnable {

  public void run() {
      System.out.println("Hello from a thread!");
  }

  public static void main(String args[]) {
      (new Thread(new concurr())).start();
  }

}