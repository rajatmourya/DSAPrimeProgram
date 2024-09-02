package DataStructure.LinkedList;

import java.util.Scanner;

public class GetLinkedList {
    public static ListNode getList(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the list");
        ListNode head = null;
        ListNode temp  = null;
        while(n != 0){
            int data = sc.nextInt();
            ListNode newListNode = new ListNode(data);
            if(head == null){
                head = temp = newListNode;
            }else{
                temp.next = newListNode;
                temp = newListNode;
            }
            n -= 1;
        }
        return head;
    }
}
