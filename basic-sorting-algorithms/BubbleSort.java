// Implement bubble sort

import java.util.*;

public class BubbleSort {

    public static void print(int[] arr) {
        System.out.println("After sorting : ");
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1- i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(input);
        print(input);
    }
    
}
