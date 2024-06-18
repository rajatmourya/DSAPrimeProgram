package DataStructure.Queue;

public class QueueUsingCircularQueueArray {
    int size;
    private int[] arr;
    private int front;
    private int rear;

    public QueueUsingCircularQueueArray(int size){
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if ((rear == size -1 && front == 0) || rear+1 == front) return true;
        return false;
    }

    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full, You can not add it.");
            return false;
        }
        if(isEmpty()) {
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
        return true;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty, Cannot dequeue");
            return -1;
        }
        int temp = arr[front];
        if (front == rear) {
            front = rear = -1;
            return temp;
        }
        front = (front+1)%size;
        return temp;

    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty, Cannot peek");
            return -1;
        }
        return arr[front];

    }

    public void printQueue(){
        if(isEmpty()) return;

        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else {
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


}
