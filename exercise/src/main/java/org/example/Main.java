package org.example;

import org.example.four.Add4;
import org.example.four.AddDelete4;
import org.example.pingpong.Ping;
import org.example.pingpong.Pong;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
//        Object lockObject = new Object();
//        Thread ping = new Thread(new Ping(lockObject));
//        Thread pong = new Thread(new Pong(lockObject));
//        ping.start();
//        pong.start();

        ArrayList<Integer> list = new ArrayList<>();
        AddDelete4 add = new AddDelete4(list, true);
        AddDelete4 delete = new AddDelete4(list, false);
        add.start();
        delete.start();
    }

}