
public class Exercise4 {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println("First Element: " + queue.peekHead());
		System.out.println("Last Element: " + queue.peekTail());
		queue.remove();
		System.out.println(queue);
	}

}
