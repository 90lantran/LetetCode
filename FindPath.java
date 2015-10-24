package letcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import letcode.LCABT.TreeNode;


public class FindPath {
	
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
	
//	private List<String> DFS(TreeNode root){
//		if (root == null)
//			return new ArrayList<>();
//		List<String> returnList = new ArrayList<>();
//		helper(root, returnList);
//		
//		return returnList;
//	}
//	
//	private void helper (TreeNode node, List<String> list){
//		      
//		if (node.left == null && node.right == null){
//			list.add(node.val + " ");
//		}
//		
//		if (node.left != null){
//			helper(node.left, list);
//		}
//		if (node.right != null){
//			helper(node.right, list);
//		}
//		
//	}
	
	public List<String> binaryTreePaths(TreeNode root) {
	    if (root == null){
	        return new ArrayList<>();
	    }
	    List<String> returnList = new ArrayList<>();
	    getBinaryTreePaths(returnList,root,"");
	    return returnList;

	}

	private void getBinaryTreePaths(List<String> returnList, TreeNode node,String base) {
	    String current = base.length()==0 ? node.val+"" : base+"->"+node.val;
	    if(node.left == null && node.right == null){
	        returnList.add(current);
	    }
	    if (node.left != null){
	        getBinaryTreePaths(returnList,node.left,current);
	    }
	    if (node.right != null){
	        getBinaryTreePaths(returnList,node.right,current);
	    }
	}
	
	public static void main(String[] args){
		FindPath fp = new FindPath();
		LinkedList<TreeNode> mList = new LinkedList<TreeNode>();
		TreeNode root = fp.new TreeNode(3);
		root.left = fp.new TreeNode(5);
		root.right = fp.new TreeNode(1);
		
		root.left.left = fp.new TreeNode(6);
		root.left.right = fp.new TreeNode(2);
		
		root.left.right.left = fp.new TreeNode(7);
		root.left.right.right = fp.new TreeNode(4);
		
		root.right.left = fp.new TreeNode(0);
		root.right.right = fp.new TreeNode(8);
		
		mList.add(root);
		
		System.out.println(fp.binaryTreePaths(root).toString());
		
		//System.out.println(fp.DFS(root).toString());
	
	}

}
