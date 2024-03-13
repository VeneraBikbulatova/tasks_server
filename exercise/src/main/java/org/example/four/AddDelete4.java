package org.example.four;

import java.util.ArrayList;

public class AddDelete4 extends Thread {
    private AddDeleteList list;
    private boolean flag;
    int count;
    int c;
    public AddDelete4(ArrayList<Integer> list, boolean flag) {
        this.list = new AddDeleteList(list);
        this.flag = flag;
        this.count = 0;
        this.c = 10000;
    }

    public void run() {
        if (flag) {
            while (count < 10000) {
                count++;
                list.add4();
                System.out.println("Add " + count);
            }
        } else {
            while (c > 0) {
                if (!list.getList().isEmpty()) {
                    list.delete4();
                    System.out.println("Delete " + c);
                    c--;
                }
            }
        }
    }
}
