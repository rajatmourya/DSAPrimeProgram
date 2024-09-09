package DataStructure.LinkedList;

public class KthNodeFromMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(8);
        ListNode n7 = new ListNode(6);
        ListNode n8 = new ListNode(4);
        ListNode n9 = new ListNode(2);
        ListNode n10 = new ListNode(0);

        head.next = n2; n2.next = n3; n3.next = n4;  n4.next = n5; n5.next = n6; n6.next = n7; n7.next = n8;
        n8.next = n9; n9.next = n10;
        int B = 100000000;

        PrintLinkedList.printList(head);
        System.out.println(kthListNode(head,B));

    }

    public static int kthListNode(ListNode head, int B) {
        ListNode middle = findMiddle(head);
        reversedLinkedList(head);
        PrintLinkedList.printList(middle);
        if(B == 0){
            return middle.val;
        }else if ( B < 0){
            return -1;
        }
        int i = 1;
        while (i <= B){

            if(i == B){
                middle = middle.next;
                return middle.val;
            }
            if(middle.next == null){
                return -1;
            }
            middle = middle.next;
            i += 1;
        }
        return -1;
    }

    public static ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reversedLinkedList(ListNode head){
        if(head == null || head.next == null) return  head;
        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
