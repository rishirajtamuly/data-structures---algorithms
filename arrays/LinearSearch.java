// Program to find a key in an array using linear search. Return index if key is found else return -1.

import java.util.*;

public class LinearSearch {

    public static int findKey(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter a key to find in array : ");
        int key = sc.nextInt();
        sc.close();

        int index = findKey(arr, key);
        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index " + index);
        }
    }
}
