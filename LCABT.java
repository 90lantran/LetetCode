package letcode;

import java.util.LinkedList;
import java.util.Stack;

import letcode.LCA.TreeNode;

public class LCABT {
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
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		Stack<TreeNode> sp = new Stack<TreeNode>();
		Stack<TreeNode> sq = new Stack<TreeNode>();
		findPath(root, p, sp);
		findPath(root, q, sq);
		TreeNode commonAncestor = null;
		while (true){
			if(!sp.isEmpty() && !sq.isEmpty()){
				TreeNode temp = sp.pop();
				if (temp.val == sq.pop().val){
					commonAncestor = temp;
				} else {
					break;
				}				
			}else{
				break;
			}
		}
		return commonAncestor;
	}
	
	private boolean findPath(TreeNode root, TreeNode target, Stack<TreeNode> s){
		if (root == null) return false;
		if (root.val == target.val){
			s.push(root);
			return true;
		}
		
		if (findPath(root.right, target, s) || findPath(root.left, target, s)){
			s.push(root);
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args){
		LCABT lcabt = new LCABT();
		LinkedList<TreeNode> mList = new LinkedList<TreeNode>();
		TreeNode root = lcabt.new TreeNode(3);
		root.left = lcabt.new TreeNode(5);
		root.right = lcabt.new TreeNode(1);
		
		root.left.left = lcabt.new TreeNode(6);
		root.left.right = lcabt.new TreeNode(2);
		
		root.left.right.left = lcabt.new TreeNode(7);
		root.left.right.right = lcabt.new TreeNode(4);
		
		root.right.left = lcabt.new TreeNode(0);
		root.right.right = lcabt.new TreeNode(8);
		
		mList.add(root);
		
		System.out.println(lcabt.lowestCommonAncestor(root, lcabt.new TreeNode(5), lcabt.new TreeNode(4)).val);
	
	}
}
