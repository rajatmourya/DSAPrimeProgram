package DataStructure.LinkedList;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        Node head = new Node(-1);
        Node n2 = new Node(-1);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(3);
        Node n6 = new Node(3);
        Node n7 = new Node(3);

        head.next = n2; n2.next = n3; n3.next = n4;  n4.next = n5; n5.next = n6; n6.next = n7;

        PrintLinkedList.printList(head);
        Node newHead = deleteDuplicate(head);
        PrintLinkedList.printList(newHead);


    }

    public static Node deleteDuplicate(Node head){
        Node orignal = head;
        Node temp = head;
        Node newHead = null;
        while (orignal != null){
            while (orignal.next != null && orignal.val == orignal.next.val){
                orignal = orignal.next;
            }
            if(newHead == null){
                newHead = temp = orignal;
            } else {
                temp.next = orignal;
                temp = orignal;
            }
            orignal = orignal.next;
        }
        return newHead;
    }
}

class PrintLinkedList{
    public static void printList(Node head){
        while (head != null){
            System.out.print(head.val + " --> ");
            head = head.next;
        }
        System.out.println();
    }
}