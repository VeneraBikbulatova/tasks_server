package org.example.four;

import java.util.ArrayList;
import java.util.Random;

public class Add4 extends Thread{
    private ArrayList<Integer> list;
    int count;
    public Add4(ArrayList<Integer> list){
        this.list = list;
    }
    public void run(){
        count = 0;
        while(count < 10000) {
            synchronized(list) {
                System.out.println("Add" + count);
                count++;
                list.add(new Random().nextInt());
                list.notifyAll();
            }
        }
    }


}
