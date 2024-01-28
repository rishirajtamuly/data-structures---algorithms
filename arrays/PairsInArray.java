// Print all the pairs in an array.

import java.util.*;

public class PairsInArray {
    
    public static void pairs(int[] arr) {
        System.out.println("Pairs present in an array : ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")" + " ");
            }
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
        pairs(arr);
    }
}
