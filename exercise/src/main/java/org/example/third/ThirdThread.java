package org.example.third;

public class ThirdThread extends Thread{

    public ThirdThread() {
    }

    @Override
    public void run() {
        System.out.println(" three");
    }
}
