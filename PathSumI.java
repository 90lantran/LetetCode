package letcode;

public class PathSumI {
//	public boolean hasPathSum(Node root, int sum){
//		if (root == null) return false;
//		
//		
//		if (root.left != null || root.right != null){
//			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//		}
//		
//		return sum - root.val == 0;
//	}
	
	public boolean hasPathSum(Node root, int sum){
		
		if (root == null){
			return sum == 0;
		}
		
		else {
			return (hasPathSum(root, sum - root.val) || hasPathSum(root, sum - root.val));
		}
		
		
	}
	public static void main(String[] args){
		BST mytree = new BST();
		mytree.insert(8);
		mytree.insert(6);
		mytree.insert(10);
		mytree.insert(1);
		mytree.insert(7);
		mytree.insert(9);
		mytree.insert(11);
		
		
		PathSumI p = new PathSumI();
		System.out.println(p.hasPathSum(mytree.root, 15));
	}
}
