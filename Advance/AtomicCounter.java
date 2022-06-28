
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
  private AtomicInteger c = new AtomicInteger(0);

  public void increment() {
    c.incrementAndGet();
  }

  public void decrement() {
    c.decrementAndGet();
  }

  public int value() {
    return c.get();
  }

}

/**
 * For this simple class, synchronization is an acceptable solution. But for a more complicated class, we might want to avoid the liveness impact 
 * of unnecessary synchronization. Replacing the int field with an AtomicInteger allows us to prevent thread interference without resorting to synchronization, as in AtomicCounter:
 */