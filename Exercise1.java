import java.util.ArrayList;

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		reverseArrayListInPlace(list);
		
	} 
	
	public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
		int middle = list.size() / 2;
		
		for(int i = 0; i < middle; i++) {
			E temp = list.get(i);
			int lastIndex = list.size() - (i + 1);
			
			list.set(i, list.get(lastIndex));
			list.set(lastIndex, temp);

		}
		
		System.out.println(list);
	}

}
