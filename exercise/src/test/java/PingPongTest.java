import org.example.pingpong.Ping;
import org.example.pingpong.Pong;
import org.junit.Test;

public class PingPongTest {
    @Test
    public void pingAndPongTest() throws InterruptedException {
        Object lockObject = new Object();
        Thread ping = new Thread(new Ping(lockObject));
        Thread pong = new Thread(new Pong(lockObject));
        ping.start();
        pong.start();
    }

}
