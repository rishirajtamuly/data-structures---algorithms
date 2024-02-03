// Print maximum sum of a sub array in an array.

import java.util.*;

public class MaxSubArraySum {
    
    // Kadane's Algorithm
    public static int maxSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currSum + arr[i] > 0) {
                currSum = currSum + arr[i];
            } else {
                currSum = 0;
            }

            if (maxSum < currSum) {
                maxSum = currSum;
            }

           // maxSum = Math.max(currSum, maxSum); 
        }
        return maxSum;
    }
    

    /* 
    // Prefix Sum approach
    public static int maxSum(int[] arr) {
        int maximumSum = Integer.MIN_VALUE;
        int currSum = 0;
        int[] prefix = new int[arr.length];

        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (maximumSum < currSum) {
                maximumSum = currSum;   
            }
        }
        return maximumSum;
    }
    */

    /* 
    // Brute Force approach
    public static int maxSum(int[] arr) {
        int maximumSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (maximumSum < sum) {
                    maximumSum = sum;
                }
            }
        }
        return maximumSum;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in an array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("Maximum subarray sum = " + maxSum(arr)); 
    }
}
