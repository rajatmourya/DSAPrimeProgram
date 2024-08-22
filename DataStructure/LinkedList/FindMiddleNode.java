package DataStructure.LinkedList;

public class FindMiddleNode {
    public static void main(String arg[]) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
//        Node n5 = new Node(5);

        head.next = n2; n2.next = n3; n3.next = n4; // n4.next = n5;

        Node middel = findMiddle(head);
        System.out.println(middel.val);
    }

    public static Node findMiddle(Node head) {
        Node s = head;
        Node f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}