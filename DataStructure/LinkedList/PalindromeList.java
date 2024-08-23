package DataStructure.LinkedList;

public class PalindromeList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(3);
        Node n6 = new Node(2);
        Node n7 = new Node(1);

        head.next = n2; n2.next = n3; n3.next = n4;  n4.next = n5; n5.next = n6; n6.next = n7;

        int ans = isPalindromeList(head);
        System.out.println(ans);


    }

    public static int isPalindromeList(Node head) {
        Node orignal = head;
        Node middle = findMiddle(head);
        Node reversedList = reverseLinkedList(middle);

        while (reversedList !=null){
            if(reversedList.val != orignal.val){
                return 0;
            }
            reversedList = reversedList.next;
            orignal = orignal.next;
        }
        return 1;
    }

    public static Node reverseLinkedList(Node head) {
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

    public static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
