package org.example.third;

public class SecondThread extends Thread{
    public SecondThread() {
    }

    @Override
    public void run() {
        System.out.println(" two");
    }
}
