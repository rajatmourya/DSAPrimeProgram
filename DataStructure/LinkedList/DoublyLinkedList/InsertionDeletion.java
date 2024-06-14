package DataStructure.LinkedList.DoublyLinkedList;

public class InsertionDeletion {
    public static Node<Integer> insertionInDoublyLinkedList (int pos, int data, Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);

        if(pos == 0){
            newNode.next = head.next;
            newNode.prev = head;
            return newNode;
        }

        Node<Integer> temp = head;

        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }

    public static Node<Integer> deletionInDoublyLinkedList (int pos, Node<Integer> head){
        Node<Integer> temp = head;

        if (pos == 0){
            return head.next;
        }
        for (int i = 0; i < pos-1 ; i++) {
            temp = temp.next;
        }

        temp.next.next.prev = temp;
        temp.next = temp.next.next;

        return head;
    }
}
