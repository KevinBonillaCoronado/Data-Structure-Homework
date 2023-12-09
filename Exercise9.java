import java.util.Arrays;

public class Exercise9 {	
	public static void main(String[] args) {
		String[] strings = {"banana", "apple", "orange", "grape", "pineapple"};
		
		System.out.println("Before Sorting: " + Arrays.toString(strings));
		
		selectionSort(strings);
		System.out.println("Selection Sort: " + Arrays.toString(strings));
		
		mergeSort(strings);
		System.out.println("Merge Sort: " + Arrays.toString(strings));
		
		bubbleSort(strings);
		System.out.println("Bubble Sort: " + Arrays.toString(strings));
		
		quickSort(strings);
		System.out.println("Quick Sort: " + Arrays.toString(strings));
		
		heapSort(strings);
		System.out.println("Heap Sort: " + Arrays.toString(strings));
	}
	
	public static <T extends Comparable<? super T>> void selectionSort(T[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j].compareTo(A[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
            }
        }
	}
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] A) {
        for(int i = 1; i < A.length; i++){
           T key = A[i];
           int j = i - 1;
            while(j >= 0 && A[j].compareTo(key) > 0){
            	A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
            }
	}
	
	public static <T extends Comparable<? super T>> void bubbleSort(T[] A) {
		int i, j;
		String temp;
        boolean swapped;
        for (i = 0; i < A.length - 1; i++) {
            swapped = false;
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j].compareTo(A[j + 1]) >= 0) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp =  (String) A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = (T) temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
	}
	
	public static <T extends Comparable<? super T>> void heapSort(T[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            T temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapify(A, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void heapify(T[] A, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left].compareTo(A[largest]) > 0) {
            largest = left;
        }

        if (right < n && A[right].compareTo(A[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            T temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            heapify(A, n, largest);
        }
    }
	
	public static <T extends Comparable<? super T>> void mergeSort(T[] A) {
		 if (A.length > 1) {
	            int mid = A.length / 2;
	            T[] left = Arrays.copyOfRange(A, 0, mid);
	            T[] right = Arrays.copyOfRange(A, mid, A.length);

	            mergeSort(left);
	            mergeSort(right);

	            merge(A, left, right);
		 }
	}
	public static <T extends Comparable<? super T>> void merge(T[] A, T[] firstHalf, T[] secondHalf) {
		int i = 0, j = 0, k = 0;
		
		while(i < firstHalf.length && j < secondHalf.length) {
			if(firstHalf[i].compareTo(secondHalf[j]) <= 0) {
				A[k] = firstHalf[i];
				i++;
				k++;
			}
			else {
				A[k] = secondHalf[j];
				j++;
				k++;
			}
		}
		while(i < firstHalf.length) {
			A[k] = firstHalf[i];
			i++;
			k++;
		}
		while(j < secondHalf.length) {
			A[k] = secondHalf[j];
			j++;
			k++;
		}
		
	}
	
	
	public static <T extends Comparable<? super T>> void quickSort(T[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private static <T extends Comparable<? super T>> void quickSort(T[] A, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(A, low, high);

            quickSort(A, low, partitionIndex - 1);
            quickSort(A, partitionIndex + 1, high);
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] A, int low, int high) {
        T pivot = A[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A[j].compareTo(pivot) <= 0) {
                i++;
                T temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        T temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;

        return i + 1;
    }

}
