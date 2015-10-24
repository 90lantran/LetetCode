package letcode;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
	public class Node<T> {
		T val;
		Node<T> next;

		public Node(T val, Node<T> next) {
			this.val = val;
			this.next = next;
		}
	}

	Node<T> head;

	public MyList() {
		head = null;
	}

	public void insertFront(T val) {
		// Node newNode = new Node(val);
		// newNode.next = head;
		// head = newNode;

		head = new Node<T>(val, head);

	}

	public boolean find(T val) {
		Node<T> travel = head;
		return findHelper(val, travel);
	}

	public boolean findHelper(T val, Node<T> node) {
		if (node == null) {
			return false;
		} else if (node.val.equals(val)) {
			return true;
		} else {
			return findHelper(val, node.next);
		}

	}

	public void delete(T val) {
		Node<T> travel = head, previous = null;
		if (find(val)) {
			while (travel != null && !travel.val.equals(val)) {
				previous = travel;
				travel = travel.next;
			}
			if (travel != null) {
				previous.next = travel.next;
			}

		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node<T> travel = head;
			@Override
			public boolean hasNext() {
				
				return travel != null && travel.next != null ;
			}

			@Override
			public T next() {
				if (hasNext()){
					T  obj = travel.val;
					travel = travel.next;
					return obj;
				}
				return null;
			}
		};
	}

}
