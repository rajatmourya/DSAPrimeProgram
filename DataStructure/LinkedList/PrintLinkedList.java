package DataStructure.LinkedList;

class PrintLinkedList {
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " --> ");
            head = head.next;
        }
        System.out.println();
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " --> ");
            head = head.next;
        }
        System.out.println();
    }
}
