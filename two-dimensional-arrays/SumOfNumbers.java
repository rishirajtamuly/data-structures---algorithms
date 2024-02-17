/*
Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
*/


public class SumOfNumbers {

    public static void sumOfElements(int[][] nums) {
        int sum = 0;
        int n = nums[1].length;
        for (int i = 0; i < n; i++) {
            sum += nums[1][i];
        }
        System.out.println("Sum of numbers = " + sum);
    }

    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sumOfElements(nums);
    }
}
