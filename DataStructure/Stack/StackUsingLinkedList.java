package DataStructure.Stack;

public class StackUsingLinkedList {

    Node head;

    boolean isEmptry() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if(isEmptry()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int temp = head.data;
            head = head.next;
            return temp;
        }
    }

    int peek() {
        if(isEmptry()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return head.data;
        }
    }










    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
}
