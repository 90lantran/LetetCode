package letcode;

import java.util.LinkedList;



public class InvertBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
	
	    public TreeNode invertTree(TreeNode root) {
	    	 if (root == null || (root.left == null && root.right == null)) return root;

	    	    TreeNode left = root.left;
	    	    root.left = invertTree(root.right);
	    	    root.right = invertTree(left);
	    	    return root;
	    }

	
	public static void main(String[] args){
		InvertBinaryTree ibt  = new InvertBinaryTree();
		LinkedList<TreeNode> mList = new LinkedList<TreeNode>();
		TreeNode root = ibt.new TreeNode(3);
		root.left = ibt.new TreeNode(5);
		root.right = ibt.new TreeNode(1);
		
		root.left.left = ibt.new TreeNode(6);
		root.left.right = ibt.new TreeNode(2);
		
		root.left.right.left = ibt.new TreeNode(7);
		root.left.right.right = ibt.new TreeNode(4);
		
		root.right.left = ibt.new TreeNode(0);
		root.right.right = ibt.new TreeNode(8);
		
		mList.add(root);
		
		System.out.println(ibt.invertTree(root));
	
	}
}
