package letcode;

import java.util.LinkedList;
import java.util.Queue;

public class SiblingPointer {
	// public class Node {
	// int val;
	// Node left;
	// Node right;
	// Node sibling;
	//
	// Node(int x) {
	// val = x;
	// left = null;
	// right = null;
	// sibling = null;
	// }
	// }

	static void printByLevel(Node node) {

		if (node != null) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(node);

			while (!q.isEmpty()) {
				Node temp = q.remove();

				System.out.print(temp.val + " ");

				if (temp.left != null && temp.right != null) {
					q.add(temp.left);
					q.add(temp.right);
					if (temp.val > q.peek().val){
						System.out.println("\n");
					}
				}
				
			}
		}

	}
	
	static void addSibling(Node node){
		if (node != null) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(node);

			while (!q.isEmpty()) {
				Node current = q.remove();

				//System.out.print(temp.val + " ");
				
				if (q.peek() != null && q.peek().val > current.val){
				current.sibling = q.peek();
				
				}

				if (current.left != null && current.right != null ){
					q.add(current.left);
					q.add(current.right);
				}
			}	
			
		}
		
	}
	
	static void testAddSibling(Node current){
		while (current != null){
			System.out.println(current.val);
			Node travel = current;
			
			while (travel.sibling != null){
				System.out.println(travel.sibling.val);
				travel = travel.sibling;
			}
			current = current.left;
		}
	}
	

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(20);
		tree.insert(15);
		tree.insert(34);
		tree.insert(10);
		tree.insert(16);

		tree.insert(22);
		tree.insert(36);
		//printByLevel(tree.root);
		addSibling(tree.root);
		testAddSibling(tree.root);
	}
}
