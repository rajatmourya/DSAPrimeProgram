package DataStructure.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SortBinaryLinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total Number of Element:");
        int n = Integer.parseInt(br.readLine());
        ListNode head = GetLinkedList.getList(n);
        ListNode ans = sortBinaryListHelpper(head);
        PrintLinkedList.printList(ans);
    }

    public static ListNode sortBinaryListHelpper(ListNode head) {
        ListNode curr = head;
        ListNode ans = head;
        if(curr.val == 0){
            ans = curr;
        }else{
            ListNode temp = curr;
            ListNode prev = curr;
            while (curr.val != 0){
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;
            curr.next = temp;

        }
        return ans;
    }
}
