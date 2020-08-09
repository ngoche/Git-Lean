package jav.study.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static volatile  int a = 0;
    public static void main(String args[]) throws InterruptedException{

        List<Thread> list = new  ArrayList<Thread>();
        for(int i = 0 ; i<11 ;i++){
            list.add(new Thread());
            if(i == 6 )
            	a = 100;
        }

        for (Thread thread : list) {
            thread.start();
        }

        Thread.sleep(2000);
        System.out.println(a);
    }
}