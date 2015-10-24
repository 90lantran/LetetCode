package letcode;

import java.util.List;

public class ValidBST {
//
	public boolean isBST2(Node root) {
		return (isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	/**
	 * Efficient BST helper -- Given a node, and min and max values, recurs down
	 * the tree to verify that it is a BST, and that all its nodes are within
	 * the min..max range. Works in O(n) time -- visits each node only once.
	 */
	private boolean isBST2(Node node, int min, int max) {
		if (node == null) {
			return (true);
		} else {
			// left should be in range min...node.data
			
			if (node.val < min || node.val > max) return false;
			
			if (!isBST2(node.left, min, node.val) || !isBST2(node.right, node.val, max)){
				return false;
			}
			
			return true;
			
			
//			boolean leftOk = (node.left.val > min && node.left.val < node.val)?isBST2(node.left, min, node.val):false;
//			// if the left is not ok, bail out
//			if (!leftOk)
//				return (false);
//			// right should be in range node.data+1..max
//			boolean rightOk = (node.right.val > node.val && node.right.val < max )?isBST2(node.right, node.val + 1, max):false;
//			return (rightOk);
		}
	}
//
//	public boolean isValidBST(Node root) {
//		return helper(root, root.val);
//
//	}
//
//	private boolean helper(Node root, int rootValue) {
//		if (root != null) {
//		 if (root.right != null) {
//				if (root.val < root.right.val && rootValue < root.right.val) {
//					return helper(root.right, rootValue)
//							|| helper(root.left, rootValue);
//				} else {
//					return false;
//				}
//			} else if (root.left != null){
//				if (root.val > root.left.val && rootValue > root.left.val) {
//					return helper(root.right, rootValue)
//							|| helper(root.left, rootValue);
//				} else {
//					return false;
//				}
//			}
//		}
//
//		return true;
//	}

	private void inOrderTraversal(Node node) {
		inOrderTraversalHelper(node);
	}

	private void inOrderTraversalHelper(Node node) {
		if (node != null) {
			inOrderTraversalHelper(node.left);
			System.out.println(node.val);
			inOrderTraversalHelper(node.right);
		}
	}

	
//	public boolean isBST2(Node node){
//		return false;
//	}
	
	public boolean isBST1(Node node){
		if (node == null) return true;
		
		if (node.left != null && getMax(node.left) > node.val) return false;
		if (node.right != null && getMin(node.right) < node.val) return false;
		
		return isBST1(node.left) && isBST1(node.right);
	}
	
	private int getMax(Node node){
		if(node.right != null){
			node = node.right;
		}
		return node.val;
	}
	
	private int getMin(Node node){
		if(node.left != null){
			node = node.left;
		}
		return node.val;
	}
	//private boolean helper1(Node)
	
	public static void main(String[] args) {
		BST mytree = new BST();
		mytree.insert(8);
		mytree.insert(6);
		mytree.insert(10);
		mytree.insert(1);
		mytree.insert(7);
		mytree.insert(9);
		mytree.insert(11);

		ValidBST v = new ValidBST();
		v.isBST2(mytree.root);
		v.inOrderTraversal(mytree.root);
	}
}
