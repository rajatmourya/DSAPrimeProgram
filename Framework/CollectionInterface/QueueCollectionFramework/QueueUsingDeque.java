package Framework.CollectionInterface.QueueCollectionFramework;

import java.util.ArrayDeque;

public class QueueUsingDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(20);
        queue.offer(10);
        queue.offer(50);
        queue.offer(60);
        queue.offer(80);
        queue.offer(90);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
