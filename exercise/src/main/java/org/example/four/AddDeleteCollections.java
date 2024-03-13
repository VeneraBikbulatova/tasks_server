package org.example.four;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class AddDeleteCollections extends Thread {
    Collection<Integer> list;
    int count;
    int c;

    public AddDeleteCollections(ArrayList<Integer> list) {
        this.list = Collections.synchronizedCollection(list);
    }

    public void run() {
        add4();
        delete4();
    }

    public synchronized void add4() {
        count = 0;
        while (count < 10000) {
            System.out.println("Add" + count);
            count++;
            list.add(new Random().nextInt());
        }
    }

    public synchronized void delete4() {
        c = 10000;
        while (c > 0) {
            System.out.println("Delete" + c);
            c--;
            list.remove(new Random().nextInt(list.size()));
        }
    }
}
