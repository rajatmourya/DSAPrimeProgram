package DataStructure.LinkedList;

public class LernLinkedList {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1);

        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(9);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedListDisplay.printLinkedList(head);

        LinkedListInsertion.insertInLinkedList(4,24, head);
        LinkedListInsertion.insertInLinkedList(5,27, head);

        LinkedListDisplay.printLinkedList(head);

        LinkedListDeletion.deletionInLinkedList(2,head);
        LinkedListDeletion.deletionInLinkedList(5,head);
        LinkedListDisplay.printLinkedList(head);

    }



}

class Node <E> {
    E val;
    Node <E> next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }
}