package letcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplication {
	
	static void removeDuplication1(MyList<Integer> list){
		Map<Integer, Boolean> map = new HashMap<>();
		MyList<Integer>.Node<Integer> head = list.head;
		MyList<Integer>.Node<Integer> previous = null;
		
		while (head != null){
			if ( map.containsKey(head.val)){
				previous.next = head.next;
			} else {
				map.put(head.val, true);
				previous = head;
			}
			head = head.next;
		}
		
		
		printList(list.head);
		
	}
	
	static void printList (MyList<Integer>.Node<Integer> n){
		if ( n != null){
			System.out.println(n.val);
			printList(n.next);
			
		}
	}
	
	static void removeDuplication2(MyList<Integer> list){
		MyList<Integer>.Node<Integer> travel = list.head;
		MyList<Integer>.Node<Integer> previous = null;
		
		while (travel != null){
			//Integer target = travel.val;
			previous = travel;
			while(previous.next != null){
				if (previous.next.val.equals(travel.val)){
					previous.next = previous.next.next;
				} else {
					
					previous = previous.next;
				}
				
			}
			
			travel = travel.next;
		}
		printList(list.head);
	}
	
	
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<Integer>();
		
		list.insertFront(2);
		list.insertFront(2);
		list.insertFront(8);
		list.insertFront(2);
		list.insertFront(2);
		list.insertFront(10);
		list.insertFront(11);
		
		//printList(list.head);
		//removeDuplication1(list);
		removeDuplication2(list);
		
	}
}
