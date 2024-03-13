package org.example.four;

import java.util.ArrayList;
import java.util.Random;

public class AddDeleteList {
    private ArrayList<Integer> list;
    public AddDeleteList(ArrayList<Integer> list){
        this.list = list;
    }

    public synchronized void add4() {
        list.add(new Random().nextInt());
    }

    public synchronized void delete4() {
        list.remove(new Random().nextInt(list.size()));
    }

    public ArrayList<Integer> getList(){
        return list;
    }

}
