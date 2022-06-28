package Concurrency;

import java.util.ArrayList;
import java.util.List;

class Counter implements Runnable {
  int c;

  public Counter() {
    c = 0;
  }

  public synchronized void Inc() {
    c++;
    System.out.format("%s\tc -> %d\n", Thread.currentThread().getName(),c);
  }
  
  public synchronized void Dec() {
    c--;
    System.out.format("%s\tc -> %d\n", Thread.currentThread().getName(),c);
  }

  public synchronized void print() {
    System.out.format("%s\tCurrent val: %d\n", Thread.currentThread().getName(), c);
    System.out.println();
  }

  // public  void Inc() {
  //   c++;
  //   System.out.format("%s\tc -> %d\n", Thread.currentThread().getName(),c);
  // }
  
  // public  void Dec() {
  //   c--;
  //   System.out.format("%s\tc -> %d\n", Thread.currentThread().getName(),c);
  // }

  // public  void print() {
  //   System.out.format("%s\tCurrent val: %d\n", Thread.currentThread().getName(), c);
  //   System.out.println();
  // }
  
  @Override
  public void run() {
    while (true) {
      try {
        Inc();        
        Thread.sleep(1000);
        Dec();
        Thread.sleep(1000);
        print();
      } catch (InterruptedException e) {
        System.out.println("Couldn't complete");
      }
    }
  }
}


public class sync {

  String lastName;
  int nameCount;
  protected List<String> nameList;

  public sync() {
    lastName = "";
    nameCount = 0;
    nameList = new ArrayList<>();
  }

  public void addName(String name) {
    synchronized (this) {
      lastName = name;
      nameCount++;
    }
    nameList.add(name);
  }

  public static void main(String[] args) throws InterruptedException {
    Counter obj = new Counter();
    /**
     * making the 2 threads point to same object
     */
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("~~~~DONE!!~~~~");
  }
}
