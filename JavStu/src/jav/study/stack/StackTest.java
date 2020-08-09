package jav.study.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("e");
		stack.push("a");
		stack.push("d");
		stack.push("b");
		stack.push("c");
		stack.push("D");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.lastElement());
		System.out.println("last stack: "+stack);
		
		Deque<String> que = new LinkedList<String>();
		que.add("e");
		que.add("a");
		que.add("d");
		que.add("b");
		que.add("c");
		que.add("D");
		System.out.println(que.getFirst());
		System.out.println(que);
		
		
	}
}
