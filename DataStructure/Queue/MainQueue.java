package DataStructure.Queue;

public class MainQueue {
    public static void main(String[] args) {
//        callToQueueUsingArray();
        callToQueueUsingCircularQueueArray();
    }

    private static void callToQueueUsingCircularQueueArray() {
        QueueUsingCircularQueueArray q = new QueueUsingCircularQueueArray(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(60);
        q.enqueue(80);
        q.enqueue(90);


        q.printQueue();

        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.printQueue();

        q.enqueue(80);
        q.enqueue(90);

        q.printQueue();

    }

    private static void callToQueueUsingArray() {
        QueueUsingArray q = new QueueUsingArray(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(60);
        q.enqueue(80);
        q.enqueue(90);


        q.printQueue();

        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.printQueue();



    }
}
