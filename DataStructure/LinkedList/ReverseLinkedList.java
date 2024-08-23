package DataStructure.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        head.next = n2; n2.next = n3; n3.next = n4;  n4.next = n5; n5.next = n6; n6.next = n7;

        PrintLinkedList.printList(head);
        Node newHead = reverseLinkedList(head);
        PrintLinkedList.printList(newHead);


    }
    public static Node reverseLinkedList(Node head){
        if(head == null || head.next == null) return head;
        Node prev = head;
        Node curr = head.next;
        head.next = null;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
