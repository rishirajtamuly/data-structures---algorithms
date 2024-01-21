/* Find the maximum value out of all the elements in the array. 
{2, 4, 1, 6, 8, 9, 0} --> 9
{2, 4, 6, 1, 3, 7, 9, 12, 56, 43, 21}
*/ 

import java.util.*;

public class MaxInArray {
    
    public static int max(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int i : arr) {
            if (maxNum < i) {
                maxNum = i;
            }
        }
        return maxNum;
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

        System.out.println("Maximum value in array = " + max(arr));
    }
}
