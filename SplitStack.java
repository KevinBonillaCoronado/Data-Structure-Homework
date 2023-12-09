
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class SplitStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(5);
		stack1.push(-5);
		stack1.push(67);
		stack1.push(-45);
		stack1.push(67);
		stack1.push(9);
		stack1.push(0);
		stack1.push(-42);
		stack1.push(56);
		stack1.push(-7);
		System.out.println("Method Input: " + stack1);
		splitStack(stack1);
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(1);
		stack2.push(-2);
		stack2.push(-3);
		stack2.push(4);
		stack2.push(-5);
		stack2.push(6);
		stack2.push(-7);
		stack2.push(8);
		stack2.push(-9);	
		
		splitStack(stack2);
		
	}
	
	public static void splitStack(Stack<Integer> stack) {
		Stack<Integer> stackSplit = new Stack<>();
		for(int i = 0; i < stack.size(); i++) {
			if(stack.get(i) < 0) {
				stackSplit.push(stack.get(i));
			}
		}
		
		for(int i = 0; i < stack.size(); i++) {
			if(stack.get(i) >= 0) {
				stackSplit.push(stack.get(i));
			}
		}
		 System.out.println(stackSplit);
	}
}
