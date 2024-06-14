package DataStructure.Array.LimkedList;

public class LinkedListInsertion {
    public static Node<Integer> insertInLinkedList(int pos, int data, Node<Integer> head){

        Node<Integer> newNode = new Node<>(data);

        if (pos == 0){
            newNode.next = head;
            return newNode;

        }

        Node<Integer> temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}
