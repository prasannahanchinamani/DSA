package dsa.collections.collection_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Circular_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
    }
}
