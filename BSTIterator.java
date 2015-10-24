package letcode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
	
	private List<Integer> list = new ArrayList<Integer>();
	private int index = 0;
	//Node root;
	private void inOrderTraversal(Node node){
		inOrderTraversalHelper(node,list);
	}
	
	private void inOrderTraversalHelper(Node node, List<Integer> list){
		if(node != null){
			inOrderTraversalHelper(node.left, list);
			list.add(node.val);
			inOrderTraversalHelper(node.right, list);
		}
	}
	
	public BSTIterator(Node root) {
        //this.root = root;
        inOrderTraversal(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (index < list.size()){
        	return true;
        } else {
        	return false;
        }
    }

    /** @return the next smallest number */
    public int next() {
        if(hasNext()){
        	return list.get(index++);
        }
        return -1;
    }
}
