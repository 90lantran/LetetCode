package letcode;

import java.util.Stack;

class QueueByStack {
	public static Stack<Integer> myStack = new Stack<>();
    // Push element x to the back of queue.
	
    public void push(int x) {
        myStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> secondStack = new Stack<>();
        while(myStack.isEmpty()){
        	secondStack.push(myStack.pop());
        }
        secondStack.pop();
        while(secondStack.isEmpty()){
        	myStack.push(secondStack.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack<Integer> secondStack = new Stack<>();
        while(!myStack.isEmpty()){
        	secondStack.push(myStack.pop());
        }
        int firstElt = secondStack.peek();
        while(!secondStack.isEmpty()){
        	myStack.push(secondStack.pop());
        }
        return firstElt;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return myStack.isEmpty();
    }
    
    public static void main(String[] args){
    	QueueByStack x = new QueueByStack();
    	x.push(1);
    	int output = x.peek();
    }
}
