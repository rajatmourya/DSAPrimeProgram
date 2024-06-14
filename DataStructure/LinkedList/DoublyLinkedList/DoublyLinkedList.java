package DataStructure.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);

        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);

        Node<Integer> end = new Node<>(9);


        n1.prev = head;
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;
        end.prev = n4;

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = end;

        printDoublyLinkedList(head);

        InsertionDeletion.insertionInDoublyLinkedList(4,24,head);
        InsertionDeletion.insertionInDoublyLinkedList(5,27,head);

        printDoublyLinkedList(head);

        InsertionDeletion.deletionInDoublyLinkedList(2,head);
        InsertionDeletion.deletionInDoublyLinkedList(5,head);

        printDoublyLinkedList(head);
        printReverseDoublyLinkedList(end);

    }

    public static void printDoublyLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverseDoublyLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println();
    }



}

class Node <E> {
    Node <E> prev;
    E val;
    Node <E> next;

    public Node(E val) {
        this.prev = null;
        this.val = val;
        this.next = null;
    }
}
