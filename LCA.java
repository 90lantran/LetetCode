package letcode;

public class LCA {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null || p == null || q == null) {
			return null;
		}

		TreeNode smallerNode;
		TreeNode largerNode;

		if (p.val > q.val) {
			smallerNode = q;
			largerNode = p;
		} else {
			smallerNode = p;
			largerNode = q;
		}

		if (root.val >= smallerNode.val && root.val <= largerNode.val) {
			return root;
		} else if (largerNode.val < root.val) {
			return lowestCommonAncestor(root.left, smallerNode, largerNode);
		} else {
			return lowestCommonAncestor(root.right, smallerNode, largerNode);
		}

	

	}
}
