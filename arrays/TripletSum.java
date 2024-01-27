/* Find a triplet that upon addition gives value equal to sum.
a[] -> {10, 20, 30, 40}
Triplets are - {10, 20, 30} {10, 20, 40} {10, 30, 40} {20, 30, 40}
sum = 80
sum of (10, 30, 40) gives 80
*/

import java.util.*;

public class TripletSum {
    
    public static void triplets(int[] arr, int sum) {
        System.out.println("Triplets in array whose sum equals to " + sum + " are : ");
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter sum : ");
        int sum = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        triplets(arr, sum);
    }
}
