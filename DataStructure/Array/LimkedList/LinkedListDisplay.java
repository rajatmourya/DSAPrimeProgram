package DataStructure.Array.LimkedList;

public class LinkedListDisplay {
    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
