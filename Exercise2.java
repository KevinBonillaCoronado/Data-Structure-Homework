import java.util.List;
import java.util.ArrayList;

public class Exercise2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		List<Integer> secondList = new ArrayList<>();
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		add(numbers, 2, 23);
		
		System.out.println("Element Removed: " + remove(numbers, 2));
		
		System.out.println("Element at index: " + get(numbers, 4));
		
		System.out.println("Index Of Method: " + indexOf(numbers, 5));
		
		System.out.println("Last Index Of Method: " + lastIndexOf(numbers, 2));
		
		System.out.println("Part G Remove Method: " + remove(numbers, 1));
		
		System.out.println("Equals Method: " + equals(numbers, secondList));
		
	}
	
	//part a
	public static <E> void add(List<E> list, int index, E element) {
		 if (index < 0 || index > list.size()) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
	        }

	        int size = list.size();
	        list.add(size, list.get(list.size() - 1));

	        for (int i = size - 1; i > index; i--) {
	            list.set(i, list.get(i - 1));
	        }

	        list.set(index, element);
	        System.out.println(list);
	}
	
	//part b
	public static <E> E remove(List<E> list, int index) {
		if (index < 0 || index >= list.size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
		}
		E removedElement = list.get(index);

        for (int i = index; i < list.size() - 1; i++) {
            list.set(i, list.get(i + 1));
        }

        list.remove(list.size() - 1);

        return removedElement;
	}
	
	// part c
    public static <E> E get(List<E> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
        }
        return list.get(index);
    }

    //part d
    public static <E> void set(List<E> list, int index, E element) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
        }
        System.out.println("Set Method: " + list.set(index, element));
    }

    //part e
    public static <E> int indexOf(List<E> list, E element) {
        for (int i = 0; i < list.size(); i++) {
            if (element == null ? list.get(i) == null : element.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    //part f
    public static <E> int lastIndexOf(List<E> list, E element) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (element == null ? list.get(i) == null : element.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    //part g
    public static <E> boolean remove(List<E> list, E element) {
        int index = indexOf(list, element);
        if (index != -1) {
            list.remove(index);
            return true;
        }
        return false;
    }

    //part h
    public static <E> boolean equals(List<E> list1, List<E> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            E element1 = list1.get(i);
            E element2 = list2.get(i);

            if (element1 == null ? element2 != null : !element1.equals(element2)) {
                return false;
            }
        }

        return true;
    }
    

}
