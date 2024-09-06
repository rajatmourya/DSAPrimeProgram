package DataStructure.LinkedList;
import java.io.*;



public class ReorderList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of element in the List ");
        int n = Integer.parseInt(br.readLine());
        ListNode l = GetLinkedList.getList(n);
//        0, 5, 1, -9, 7, 3, -1, -3

//        ListNode l = new ListNode(0);
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        ListNode l3 = new ListNode(-9);
//        ListNode l4 = new ListNode(7);
//        ListNode l5 = new ListNode(3);
//        ListNode l6 = new ListNode(-1);
//        ListNode l7 = new ListNode(-3);
//
//        l.next = l1; l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5; l5.next = l6; l6.next = l7;

        System.out.println("Your list is: ");
        PrintLinkedList.printList(l);
        ListNode ans = reorderList(l);
        System.out.println("Sorted list is: ");
        PrintLinkedList.printList(l);
        PrintLinkedList.printList(ans);

    }

    public static ListNode reorderList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = reverseLinkedList(slow);
        ListNode l1 = head;

        while (true){
            if(l1 == l2){
                l1.next = null;
                break;
            }
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            if (l2Next != null){

            l2 = l2Next;

            }
        }
        return head;
    }

    public  static ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
