package org.example.pingpong;

public class Ping implements Runnable {
    private Object lockObject;

    public Ping(Object lockObject) {
        this.lockObject = lockObject;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lockObject) {
                try {
                    System.out.println("ping");
                    lockObject.notifyAll();
                    lockObject.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
