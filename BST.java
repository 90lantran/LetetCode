package letcode;

import java.util.Iterator;

public class BST implements Iterable<Node> {
//	public class Node {
//		int data;
//		Node left, right;
//
//		public Node(int data) {
//			this.data = data;
//			left = right = null;
//		}
//	}

	public Node root = null;


	public int biggest() {
		if (root == null) {
			return -1;
		} else {
			return biggest(root, null);
		}

	}

	private int biggest(Node node, Node pre) {

		if (node == null) {
			return pre.val;
		} else {
			pre = node;
			return biggest(node.right, node);
		}
	}

	public boolean insert(int value) {
		if (root == null) {
			root = new Node(value);

		} else {
			root = insert(value, root);
		}
		return true;
	}

	public Node insert(int value, Node node) {
		if (node == null) {
			node = new Node(value);

		} else {
			if (node.val > value) {
				node.left = insert(value, node.left);
			} else {
				node.right = insert(value, node.right);
			}
		}
		return node;
	}

	public String toString(Node node) {
		String result = "", strLeft = "", strRight = "";

		if (node != null) {
			strLeft = toString(node.left);
			strRight = toString(node.right);
			result = strLeft + node.val + strRight;
		}
		return result;
	}

	// private String toString(Node travel) {
	// String result = "", leftStr, rightStr;
	//
	// if (travel != null) {
	// leftStr = toString(travel.left); // postorder
	// rightStr = toString(travel.right);
	// result = leftStr + (leftStr.equals("") ? "" : " ") + travel.data
	// + (rightStr.equals("") ? "" : " ") + rightStr;
	// }
	//
	// return result;
	// }

	// why in this case do we want to have a recursive helper method, with a
	// different parameter list, which is called by toString() below? (In
	// other words, why not just make this toString() method be recursive, and
	// not have a helper method at all?)
	public String toString() {
		return toString(root);
	}

	public int size() {
		if (root == null) {
			return 0;
		} else {
			return size(root);
		}
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + size(node.left) + size(node.right);
		}
	}

	public boolean lookup(int x) {
		// if (root == null) return false;
		return lookup(x, root);
	}

	private boolean lookup(int x, Node node) {
		if (node == null) {
			return false;
		} else if (node.val == x) {
			return true;
		} else {
			if (node.val > x) {
				return lookup(x, node.left);
			} else {
				return lookup(x, node.right);
			}
		}
	}

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub

		return new Iterator<Node>() {
			int count = size();

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if (count == 0)
				return false;
				else return true;
			}

			@Override
			public Node next() {
				// TODO Auto-generated method stub
				count--;
				Node max;
				int maximum = biggest();
				max = new Node(maximum);
				return max;
			}

		};
	}

	public static void main(String args[]) {
		BST mytree = new BST();
		mytree.insert(12);
		mytree.insert(15);
		mytree.insert(7);
		mytree.insert(6);
		mytree.insert(9);
		mytree.insert(100);
		
		Iterator<Node> it = mytree.iterator();

		System.out.println(mytree.toString());
		System.out.println(mytree.size());
		System.out.println(mytree.biggest());
		System.out.println(mytree.lookup(2));
		
		if (it.hasNext()){
			System.out.println(it.next().val);
		}
		if (it.hasNext()){
			System.out.println(it.next().val);
		}
		
	}

}
