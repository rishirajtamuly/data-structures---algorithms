// Implement insertion sort

import java.util.*;

public class InsertionSort {
    
    public static void print(int[] arr) {
        System.out.println("After sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        /* 
        int i, j, temp;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        */

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
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
        insertionSort(input);
        print(input);
    }
}
