/*
Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort

You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
*/

public class DescendingSort {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxPosition] < arr[j]) {
                    maxPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxPosition];
            arr[maxPosition] = temp; 
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && curr > arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--; 
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = count.length - 1; i >= 0 ; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);
        System.out.print("After Bubble Sort : "); 
        print(arr);
        System.out.print("After Selection Sort : ");
        selectionSort(arr);
        print(arr);
        System.out.print("After Insertion Sort : ");
        insertionSort(arr);
        print(arr);
        System.out.print("After Counting Sort : ");
        countingSort(arr);
        print(arr);
    }
}
