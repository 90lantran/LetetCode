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
					temp.left.sibling = temp.right;
					if (temp.val < q.peek().val) {
						temp.right.sibling = q.peek().left;
					}
				}
				
				
			}
		}

	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(20);
		tree.insert(15);
		tree.insert(34);
		tree.insert(1);
		tree.insert(16);

		tree.insert(22);
		tree.insert(36);
		printByLevel(tree.root);
	}
}
