
public class Exercise3 {
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(2);
		stack.push(4);
		stack.push(6);
		
		 System.out.println("Top element: " + stack.peek(1));
	     System.out.println("Popped element: " + stack.pop(1));
	     stack.push(1);
	     
	     System.out.println(stack);
	}
	

}
