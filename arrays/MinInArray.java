/* Find the minimum value out of all the elements in the array. 
{2, 4, 1, 6, 8, 9, 0} --> 9
{2, 4, 6, 1, 3, 7, 9, 12, 56, 43, 21}
*/ 

import java.util.*;

public class MinInArray {
    
    public static int min(int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int i : arr) {
            if (minNum > i) {
                minNum = i;
            }
        }
        return minNum;
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

        System.out.println("Minimum value in array = " + min(arr));
    }
}
