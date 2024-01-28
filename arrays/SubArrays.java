// Print all sub arrays present in an array.

import java.util.*;

public class SubArrays {
    
    public static void printSubArrays(int[] arr) {
        System.out.println("Sub arrays present in the array are : ");
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {    // print
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter size of array : "));
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements in array : ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        printSubArrays(arr);
    }
}
