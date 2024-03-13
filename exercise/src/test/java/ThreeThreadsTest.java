import org.example.third.OneThread;
import org.example.third.SecondThread;
import org.example.third.ThirdThread;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ThreeThreadsTest {
    @Test
    public void ThreeThreads() throws InterruptedException {
        OneThread oneThread = new OneThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();
        oneThread.start();
        secondThread.start();
        thirdThread.start();
        oneThread.join();
        secondThread.join();
        thirdThread.join();
        assertFalse(oneThread.isAlive());
        assertFalse(secondThread.isAlive());
        assertFalse(thirdThread.isAlive());
    }
}
