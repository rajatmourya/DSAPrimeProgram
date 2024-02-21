package Framework.CollectionInterface.QueueCollectionFramework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);
        pq.offer(60);
        pq.offer(80);
        pq.offer(90);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
