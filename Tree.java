package letcode;

import javax.management.RuntimeErrorException;

public class Tree {
	private class Node {
		private int val;
		private Node left = null ;
		private Node right = null;
		private Node mid = null;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node root;

	/*
	 * Please complete this method. Inserts val into the tree. There is no need
	 * to rebalance the tree.
	 */
	/**
	 * Constructor
	 */
	public Tree(){
		root = null;
	}
	/**
	 * Insert value in the tree
	 * @param val value needs to be inserted
	 */
	public void insert(int val) {
		root = insertHelper(val, root);
	}
	/**
	 * Helper function for insert
	 * @param val value needs to be inserted
	 * @param node node in the tree
	 * @return root of the tree
	 */
	private Node insertHelper(int val, Node node) {
		if (node == null) {
			return new Node(val);
		}
		if (node.val == val) {
			 node.mid =insertHelper(val, node.mid);
		} else if (node.val > val) {
			 node.left = insertHelper(val, node.left);

		} else {
			 node.right = insertHelper(val, node.right);
		}
		return node;
	}

	/*
	 * Please complete this method. Deletes only one instance of val from the
	 * tree. If val does not exist in the tree, do nothing. There is no need to
	 * rebalance the tree.
	 */
	/**
	 * Delete a node is associated with val in the tree
	 * @param val value needs to be deleted
	 */
	public void delete(int val) {
		if (root != null) {
			root = deleteHelper(root, val);
		} else {
			System.out.println("The ternary tree has a null root.");
		}
	}

	/**
	 * Helper function for delete
	 * If the value you want to delete is greater than the current node's value, do delete on the right subtree
	 * If the value you want to delete is less than the current node's value, do delete on the left subtree
	 * If the value we want to delete is equal to the current node's value, do delete on the middle subtree
	 * If the value we want to delete is not in the tree, throw an exception
	 * In the case the node you want to delete has 2 children, the node's value will replaced by
	 * the biggest element inn the left subtree.
	 * @param node node of the tree
	 * @param val value needs to be deleted
	 * @return root of the tree
	 */
	private Node deleteHelper(Node node, int val) {
		if (node == null) {
			throw new RuntimeErrorException(null,
					"The value you want to delete (" + val +") is not in the tree.");
		} else if (node.val > val) {
			 node.left = deleteHelper(node.left, val);
		} else if (node.val < val) {
			 node.right = deleteHelper(node.right, val);
		} else {
			if (node.mid != null) {
				node.mid = deleteHelper(node.mid, val);
			} else if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			} else {
				node.val = findBiggestOnLeft(node.left);
				node.left = deleteHelper(node.left, node.val);
			}
		}
		return node;
	}
	/**
	 * Find the biggest element in the left subtree
	 * @param node node in the tree
	 * @return biggest element in the left subtree
	 */
	private int findBiggestOnLeft (Node node){
		while(node.right != null){
			node = node.right;
		}
		return node.val;
	}
	/**
	 * Traverse tree in order
	 * @param node Node in the tree
	 */
	private void printInorder (Node node){
		if (node != null){
			printInorder(node.left);
			System.out.print(node.val +" "+ printMiddle(node, ""));
			printInorder(node.right);
		}
	}
	
	/**
	 * Helper function to print in order
	 * @param node node in the tree
	 * @param s string of middle value
	 * @return string of middle value
	 */
	private String printMiddle(Node node, String s){
		if (node != null && node.mid!= null){
			s = s + node.mid.val + " ";
			printMiddle(node.mid,s );
		} 
		return s;
	}
	public static void main(String[] args){
		Tree t = new Tree();
		t.insert(7);
		t.insert(10);
		t.insert(10);
//		t.insert(5);
//		t.insert(7);
//		t.insert(2);
//		t.insert(2);
		
		t.printInorder(t.root);
		System.out.println("\n");
		
		t.delete(10);
		t.printInorder(t.root);
		System.out.println("\n");
		
//		t.delete(5);
//		t.printInorder(t.root);
//		System.out.println("\n");
//		
//		t.delete(5);
//		t.printInorder(t.root);
//		System.out.println("\n");
//		
//		
//		t.delete(2);
//		t.printInorder(t.root);
//		System.out.println("\n");
//		
//		
//		t.delete(2);
//		t.printInorder(t.root);
//		System.out.println("\n");
	}
	
}
