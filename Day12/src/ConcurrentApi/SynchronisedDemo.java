package ConcurrentApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by johrir on 8/1/2017.
 */
public class SynchronisedDemo {
    LinkedBlockingQueue<Double> list =new LinkedBlockingQueue<>();
    public static void main(String[] args) {
        new SynchronisedDemo();
    }
    public SynchronisedDemo(){
        new Thread(()->{
            while (true)
            list.offer(Math.random());
        }).start();
        new Thread(()->{
            try {
                while (true)
                System.out.println(list.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
