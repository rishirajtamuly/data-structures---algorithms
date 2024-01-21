// Program to reverse an array.

import java.util.*;

public class ReverseArray {
    
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        reverse(arr);
        printArray(arr);
    }
}
