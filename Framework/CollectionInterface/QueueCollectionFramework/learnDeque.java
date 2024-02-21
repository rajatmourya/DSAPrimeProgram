package Framework.CollectionInterface.QueueCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class learnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peek());
    }
}
