import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack <E>{
	
	private LinkedList<E> backingList;
	
	public MyStack() {
		backingList = new LinkedList<>();
	}
	
	public void push(E e) {
		backingList.addFirst(e);
	}
	
	public E pop(E e) {
		if(backingList.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return  backingList.removeFirst();
	}
	
	public E peek(E e) {
		if(backingList.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return (E) backingList.getFirst();
	}
	
	public String toString() {
		return "New Stack: " + backingList;
	}

}
