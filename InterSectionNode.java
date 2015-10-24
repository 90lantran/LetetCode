package letcode;

import java.util.ArrayList;

public class InterSectionNode {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode travelA = headA;
		ListNode travelB = headB;
		
		int lA = 0;
		int lB = 0;
		while (travelA != null){
			lA++;
			travelA = travelA.next;
		}
		
		while (travelB != null){
			lB++;
			travelB = travelB.next;
		}
		
		ListNode interSection = null;
		if (lA - lB == 0){
			while (travelA != null && travelA.val != travelB.val){
				travelA = travelA.next;
				travelB = travelB.next;
			}
			if (travelA != null){
				interSection = travelA;
			}
		} else {
			if (lA - lB > 0){ // A is longer
				int diff = lA -lB;
				while( diff-- >0){
					travelA = travelA.next;
				}
				// start traverse
				
			}else{ // B is longer
				int diff = lB -lA;
				while( diff-- >0){
					travelB = travelB.next;
				}
				// start traverse
			}
		}
		
		
		while(travelA != null){
			
		}
		
		return null;
	}
}
