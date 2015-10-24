package letcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import letcode.LCABT.TreeNode;

public class PathSum {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<>();
		helper(root, sum, 0, list, new ArrayList<Integer>());

		return list;
	}

	public void helper(TreeNode root, int sum, int currentSum,
			List<List<Integer>> list, List<Integer> path) {
		path.add(root.val);
		currentSum += root.val;
		if (root.left == null && root.right == null && sum == currentSum) {
			list.add(path);
		}

		if (root.left != null) {
			helper(root.left, sum, currentSum, list, new ArrayList<>(path));
		}

		if (root.right != null) {
			helper(root.right, sum, currentSum, list, new ArrayList<>(path));
		}
	}
	
	public static void main(String[] args){
		PathSum ps = new PathSum();
		LCABT fp = new LCABT();
		//LinkedList<TreeNode> mList = new LinkedList<TreeNode>();
		letcode.LCABT.TreeNode root = fp.new TreeNode(3);
		root.left = fp.new TreeNode(5);
		root.right = fp.new TreeNode(1);
		
		root.left.left = fp.new TreeNode(6);
		root.left.right = fp.new TreeNode(2);
		
		root.left.right.left = fp.new TreeNode(7);
		root.left.right.right = fp.new TreeNode(4);
		
		root.right.left = fp.new TreeNode(0);
		root.right.right = fp.new TreeNode(8);
		
		
		
		System.out.println(ps.pathSum(root,14));
		
		//System.out.println(fp.DFS(root).toString());
	
	}
}
