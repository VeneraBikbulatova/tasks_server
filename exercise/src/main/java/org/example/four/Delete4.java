package org.example.four;

import java.util.ArrayList;
import java.util.Random;

public class Delete4 extends Thread{
    private ArrayList<Integer> list;
    int count;
    public Delete4(ArrayList<Integer> list){
        this.list = list;
    }

    public void run(){
        count = 10000;
        while(count > 0){
            synchronized (list) {
                if(list.isEmpty()){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Delete" + count);
                count--;
                list.remove(new Random().nextInt(list.size()));

            }
        }
    }

}
