import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue <E>{
	
	private LinkedList<E> backingList;
	
	public MyQueue() {
		backingList = new LinkedList<>();
	}
	
	public void add(E e) {
		backingList.add(e);
	}
	
	public E remove() {
		if(backingList.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return backingList.remove();
	}
	
	public E peekHead() {
		if(backingList.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return backingList.peekFirst();
	}
	
	public E peekTail() {
		if(backingList.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return backingList.peekLast();
	}
	
	public String toString() {
		return "New Stack: " + backingList;
	}
	

}
