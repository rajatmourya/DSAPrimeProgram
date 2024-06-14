package DataStructure.Array.LimkedList;

public class LinkedListInsertion {
    public static void insertInLinkedList(int pos, int data, Node<Integer> head){
        Node<Integer> temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node<Integer> newNode = new Node<>(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
