package ua.dp.levelup.set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by java on 10.02.2017.
 */
public class Main {

    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedBlockingQueue<>(4);
        Queue<Integer> queue = new PriorityQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.offer(5));
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
