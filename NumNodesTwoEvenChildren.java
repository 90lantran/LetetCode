package letcode;

public class NumNodesTwoEvenChildren {
	
	static int numNodesTwoEvenChildren(Node node){
		int count = 0;
		
		return numNodesTwoEvenChildren(node, count);
	}
	
	static int numNodesTwoEvenChildren(Node node, int count){
		
		if (node == null) return count;
		if (node.left!= null && node.left.val % 2 == 0 && node.right != null && node.right.val % 2 == 0){
			count = 1;
		}
		
		return count + numNodesTwoEvenChildren(node.left, 0) + numNodesTwoEvenChildren(node.right,0); 
		
	}
	
	public static void main(String[] args){
		BST tree = new BST();
		tree.insert(20);
		tree.insert(14);
		tree.insert(30);
		tree.insert(8);
		tree.insert(18);
		tree.insert(26);
		tree.insert(32);
		tree.insert(10);
		tree.insert(22);
		tree.insert(40);
		tree.insert(24);
		tree.insert(36);
		tree.insert(50);
		
		System.out.println(numNodesTwoEvenChildren(tree.root));
		System.out.println(8>>1);
		
	}
}
