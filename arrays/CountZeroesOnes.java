// Count number of zeroes and ones in a given array

public class CountZeroesOnes {
    
    public static void countOfZeroesAndOnes(int[] arr) {
        int numZero = 0;
        int numOne = 0;

        for (int i : arr) {
            if (i == 0) {
                numZero++;
            } else {
                numOne++;
            }
        }

        System.out.println("Number of zeroes = " + numZero);
        System.out.println("Number of ones = " + numOne);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1};
        countOfZeroesAndOnes(arr);
    }
}
