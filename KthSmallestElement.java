package letcode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(15);
		tree.insert(12);
		tree.insert(20);
		tree.insert(7);
		tree.insert(13);
		tree.insert(16);
		tree.insert(25);

		KthSmallestElement p = new KthSmallestElement();
		// p.traverse(tree.root);
		// p.inOrder(tree.root);
		System.out.println(p.kthSmallest(tree.root,2));
	}

	public int kthSmallest(Node root, int k) {
		List<Integer> list = new ArrayList<>();
		inOrderTraversal(root, list);
		
		return list.get(k-1);
		
	}
	
	private void inOrderTraversal(Node root, List<Integer> list){
		if (root != null){
			inOrderTraversal(root.left, list);
			list.add(root.val);
			inOrderTraversal(root.right, list);
		}
	}
}
