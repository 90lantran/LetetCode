package letcode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeaf {
	public int sumNumbers(Node root) {
		List<String> l = new ArrayList<String>();
		sumNumbersHelper(root,l , "");
		//System.out.println(l.size());
		int sum = 0;
		for (String s : l){
			sum = sum + Integer.parseInt(s);
		}
		System.out.println(sum);
		return sum;
	}

	private void sumNumbersHelper(Node root, List<String> list, String base) {
		if (root != null) {
			String current = base + root.val;
			if (root.left == null && root.right == null)
				list.add(current);
			sumNumbersHelper(root.left, list, current);
			sumNumbersHelper(root.right, list, current);
		}
	}

	public static void main(String[] args) {
		BST mytree = new BST();
		mytree.insert(5);
		mytree.insert(3);
		mytree.insert(7);
		mytree.insert(2);
		mytree.insert(4);
		mytree.insert(6);
		mytree.insert(8);
		RootToLeaf r = new RootToLeaf();
		r.sumNumbers(mytree.root);
	}
}
