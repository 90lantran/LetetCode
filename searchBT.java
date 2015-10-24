package letcode;

public class searchBT {
	
	static boolean findNode(Node node,int target){
		
		if (node == null) return false;
		
		if (node.val == target) return true;
		
		return findNode(node.left, target) || findNode(node.right, target);
		
		
	}
	
	public static void main(String args[]) {
		BST mytree = new BST();
		mytree.insert(12);
		mytree.insert(15);
		mytree.insert(7);
		mytree.insert(6);
		mytree.insert(9);
		mytree.insert(100);
		
		System.out.println(findNode(mytree.root, 0));
	}
}
