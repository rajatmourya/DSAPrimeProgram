package DataStructure.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total Number of Element:");
        int n = Integer.parseInt(br.readLine());
        ListNode head = GetLinkedList.getList(n);
        System.out.println("Enter number of rotation time");
        int k = Integer.parseInt(br.readLine());
        ListNode ans = rotateRightHellper(head,k);
        PrintLinkedList.printList(ans);
    }
    public static ListNode rotateRightHellper(ListNode head, int k) {
        return addList(head);
    }
    public static ListNode addList(ListNode head){
        ListNode l1 = head;
        ListNode l2 = head;
        while (head != null){
            if(l1.next == null){
                l1.next = l2;
                break;
            }
            l1 = l1.next;
        }
        return l1;
    }
}
