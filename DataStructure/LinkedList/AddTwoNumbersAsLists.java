package DataStructure.LinkedList;

import java.util.Scanner;

public class AddTwoNumbersAsLists{
	public static void main(String[] str){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element of the list 1 & List 2: ");
		int lengthOfListOne = sc.nextInt();
		int lengthOfListTwo = sc.nextInt();
		ListNode l1 = GetLinkedList.getList(lengthOfListOne);
		ListNode l2 = GetLinkedList.getList(lengthOfListTwo);
//		ListNode l1 = new ListNode(1);
//		ListNode n2 = new ListNode(2);
//		ListNode n3 = new ListNode(3);
//		ListNode n4 = new ListNode(4);
//
//		l1.next = n2; n2.next = n3; n3.next = n4;
//
//		ListNode l2 = new ListNode(1);
//		ListNode n22 = new ListNode(7);
//		ListNode n23 = new ListNode(3);
//		ListNode n24 = new ListNode(9);
//
//		l2.next = n22; n22.next = n23; n23.next = n24;

		System.out.println("List first: ");
		printList(l1);
		System.out.println("List second:");
		printList(l2);
		ListNode ans = AddTwoNumbersAsListsHelpper(l1,l2);

		System.out.println("Result:");
		printList(ans);
	
	}
	public static void printList(ListNode head){
		while(head != null){
			System.out.print(head.val + "-->");
			head = head.next;
		}
		System.out.println();
	}

	
	public static ListNode AddTwoNumbersAsListsHelpper(ListNode l1, ListNode l2){
		ListNode r1 = ReverseLinkedList(l1);
		ListNode r2 = ReverseLinkedList(l2);
		int carry = 0;
		ListNode ans = null;
		ListNode temp = null;
		while(r1 != null || r2 != null || carry != 0){
			int sum = carry;
			if(r1 != null){
                sum = sum + r1.val;
				r1 = r1.next;
			}
			if(r2 != null){
				sum = sum + r2.val;
				r2 = r2.next;
			}
			
			int digit = sum % 10;
			carry = sum / 10;
			ListNode newListNode = new ListNode(digit);
			
			if(ans == null){
				ans = temp = newListNode;
			}else {
				temp.next = newListNode;
				temp = newListNode;	
			}
		}
		return ReverseLinkedList(ans);
	}
	
	public static ListNode ReverseLinkedList(ListNode head){
		if(head == null || head.next == null)return head;
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
class ListNode{
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
