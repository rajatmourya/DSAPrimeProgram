package DataStructure.LinkedList;

public class KthNodeFromMiddle {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        Node n6 = new Node(8);
        Node n7 = new Node(6);
        Node n8 = new Node(4);
        Node n9 = new Node(2);
        Node n10 = new Node(0);

        head.next = n2; n2.next = n3; n3.next = n4;  n4.next = n5; n5.next = n6; n6.next = n7; n7.next = n8;
        n8.next = n9; n9.next = n10;
        int B = 3;

        PrintLinkedList.printList(head);
        System.out.println(kthNode(head,B));

    }

    public static int kthNode(Node head, int B) {
        Node newHead = reversedLinkedList(head);
        PrintLinkedList.printList(newHead);
        Node middle = findMiddle(newHead
        );
        if(B == 0){
            return (int) middle.val;
        }
        int i = 1;
        while (i <= B){
            if(i == B){
                middle = middle.next;
                return (int)middle.val;
            }
            middle = middle.next;
            i += 1;
        }
        return -1;
    }

    public static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reversedLinkedList(Node head){
        if(head == null || head.next == null) return  head;
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
