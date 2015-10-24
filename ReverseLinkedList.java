package letcode;

import java.util.LinkedList;
import java.util.List;

import letcode.MyLinkedList.Node;

public class ReverseLinkedList {
//	public class ListNode {
//		int val;
//		ListNode next;
//
//		ListNode(int x) {
//			val = x;
//			next = null;
//		}
//	}

	public Node reverseList(Node head) {
//		if (head == null) return null;
//		if (head.next.next == null) return head;
//		
//		Node travel = head.next;
//		Node previous = null;
//		while(travel != null){
//			Node temp = travel;
//			temp.next = previous;
//			previous = temp;
//			travel = travel.next;
//		}
//		return head;
		
		Node newHead = null;
        while(head != null) {
           Node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
	}

	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.add(7);
		linkedlist.add(8);
		linkedlist.add(9);

//		myList.add(list.new ListNode(3));
//		myList.add(list.new ListNode(4));
//		myList.add(list.new ListNode(5));
//		myList.add(list.new ListNode(6));
//		myList.add(list.new ListNode(7));
//		myList.add(list.new ListNode(8));
		Node head = linkedlist.head;
		//Node first = head.next;
		
		Node newHead = list.reverseList(head);
		Node travel = newHead;
		String s = "";
		while (travel != null && travel.next!= null){
			s += travel.data + " ";
			travel = travel.next;
		}
		System.out.println(s);

	}
}
