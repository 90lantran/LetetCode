package letcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Path {
	public static void main(String[] args){
		BST tree = new BST();
		tree.insert(15);
		tree.insert(12);
		tree.insert(20);
		tree.insert(7);
		tree.insert(13);
		tree.insert(16);
		tree.insert(25);
		
		Path p = new Path();
		//p.traverse(tree.root);
		//p.inOrder(tree.root);
		p.preOrder(tree.root);
	}
	
	public void traverse(Node node){
		Stack<Node> stack = new Stack<Node>();
		//Map<Node, Boolean> visited = new HashMap<>();
		List<Node> visited = new ArrayList<>();
		visited.add(node);
		stack.push(node);
		
		while (!stack.isEmpty()){
			Node currentNode = stack.pop();
			System.out.println(currentNode.val);
			if (currentNode != null && currentNode.right != null && !visited.contains(currentNode.right)){
				visited.add(currentNode.right);
				stack.push(currentNode.right);
			} 
			if (currentNode != null && currentNode.left != null && !visited.contains(currentNode.left)){
				visited.add(currentNode.left);
				stack.push(currentNode.left);
				
			}
			
		}
//		for (Node n : visited){
//			System.out.println(n.val);
//		}
		
		
	}
		public void inOrder(Node node){
			if (node != null){
				inOrder(node.left);
				System.out.println( node.val );
				inOrder(node.right);
			}
		}
		public void preOrder(Node node){
			if (node != null){
				System.out.print( node.val + " ");
				preOrder(node.left);
				
				preOrder(node.right);
			}
		}
		public void postOrder(Node node){
			if (node != null){
				
				postOrder(node.left);
				
				postOrder(node.right);
				System.out.println( node.val );
			}
		}
		
		public void printPath(Node node){
			
		}
		
		public String printPathHelper(){
			return null;
		}
	
}
