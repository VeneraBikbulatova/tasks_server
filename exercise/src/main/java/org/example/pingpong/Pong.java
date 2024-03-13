package org.example.pingpong;

public class Pong implements Runnable {
    private Object lockObject;

    public Pong(Object lockObject) {
        this.lockObject = lockObject;
    }

    @Override
    public void run() {
        boolean flag = false;
        while (true) {
            synchronized (lockObject) {
                try {
                    if(flag) {
                        System.out.println("pong");
                        lockObject.notifyAll();
                        lockObject.wait();
                    } else {
                        lockObject.wait();
                        flag = true;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
