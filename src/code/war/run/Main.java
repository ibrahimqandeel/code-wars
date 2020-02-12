package code.war.run;

import code.war.datastructure.LinkedList;
import code.war.datastructure.Queue;
import code.war.datastructure.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"\n\t\t\t\t\t\t ***************** Welcome To Code Wars Challenges Project ***************** \n\n");

		Queue queue = new Queue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		queue.print();

//		System.out.println(queue.size());
		queue.delete(1);
		System.out.println();
		queue.print();
		
		queue.delete(5);
		System.out.println();
		queue.print();
		System.out.println();
		
		System.out.println(queue.size());
//
//		System.out.println(queue.peek());
//		System.out.println(queue.pop());
//		Stack stack = new Stack();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

//		System.out.println("Hello Linked List");
//		LinkedList ll = new LinkedList();
//		ll.addBack(1);
//		ll.addBack(2);
//		ll.addBack(3);
//		ll.addBack(4);
//		ll.addBack(5);
//		ll.addFront(4);
//		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.size());
//		
//		ll.delete(4);
//		ll.delete(10);
//		System.out.println();
//		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.size());
	}
}
