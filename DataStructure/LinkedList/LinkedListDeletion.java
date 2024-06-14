package DataStructure.LinkedList;

public class LinkedListDeletion {
    public static Node<Integer> deletionInLinkedList(int pos, Node head){
        Node<Integer> temp = head;
        if (pos == 0){
            return head.next;
        }
        for (int i = 0; i < pos-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
