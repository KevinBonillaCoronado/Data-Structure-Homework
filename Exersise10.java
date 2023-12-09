import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exersise10 {
	public static void main(String[] args) {
		Student s1 = new Student("Bonilla", "Kevin", 2);
		Student s2 = new Student("Ventura", "Nancy", 2);
		Student s3 = new Student("Coronado", "Eduardo", 2);
		Student s4 = new Student("Pina", "Valentina", 2);
		Student s5 = new Student("Pina", "Abigail", 2);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
	}
	
	public static <T> void selectSort(T[] A, Comparator<T> cmp) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (cmp.compare(A[j], A[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }

    public static <T> void insertionSort(T[] A, Comparator<T> cmp) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            T key = A[i];
            int j = i - 1;

            while (j >= 0 && cmp.compare(A[j], key) > 0) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
    }

    public static <T> void bubbleSort(T[] A, Comparator<T> cmp) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cmp.compare(A[j], A[j + 1]) > 0) {
                    T temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void heapSort(T[] A, Comparator<T> cmp) {
        int n = A.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i, cmp);
        }

        for (int i = n - 1; i > 0; i--) {
            T temp = A[0];
            A[0] = A[i];
            A[i] = temp;

            heapify(A, i, 0, cmp);
        }
    }

    private static <T> void heapify(T[] A, int n, int i, Comparator<T> cmp) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && cmp.compare(A[left], A[largest]) > 0) {
            largest = left;
        }

        if (right < n && cmp.compare(A[right], A[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            T swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;

            heapify(A, n, largest, cmp);
        }
    }

    public static <T> void mergeSort(T[] A, Comparator<T> cmp) {
        int n = A.length;

        if (n > 1) {
            int mid = n / 2;

            T[] leftArray = java.util.Arrays.copyOfRange(A, 0, mid);
            T[] rightArray = java.util.Arrays.copyOfRange(A, mid, n);

            mergeSort(leftArray, cmp);
            mergeSort(rightArray, cmp);

            merge(A, leftArray, rightArray, cmp);
        }
    }

    private static <T> void merge(T[] A, T[] leftArray, T[] rightArray, Comparator<T> cmp) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (cmp.compare(leftArray[i], rightArray[j]) <= 0) {
                A[k++] = leftArray[i++];
            } else {
                A[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            A[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            A[k++] = rightArray[j++];
        }
    }

    public static <T> void quickSort(T[] A, Comparator<T> cmp) {
        quickSortHelper(A, 0, A.length - 1, cmp);
    }

    private static <T> void quickSortHelper(T[] A, int low, int high, Comparator<T> cmp) {
        if (low < high) {
            int pi = partition(A, low, high, cmp);

            quickSortHelper(A, low, pi - 1, cmp);
            quickSortHelper(A, pi + 1, high, cmp);
        }
    }

    private static <T> int partition(T[] A, int low, int high, Comparator<T> cmp) {
        T pivot = A[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (cmp.compare(A[j], pivot) < 0) {
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
