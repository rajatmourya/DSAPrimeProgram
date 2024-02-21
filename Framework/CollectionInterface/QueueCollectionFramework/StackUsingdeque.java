package Framework.CollectionInterface.QueueCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingdeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(40);
        stack.push(54);
        stack.push(12);
        stack.push(37);
        stack.push(95);
        System.out.println(stack);
        for (int e:
             stack) {
        System.out.println(stack.pop());
        System.out.println(stack);

        }
    }
}
