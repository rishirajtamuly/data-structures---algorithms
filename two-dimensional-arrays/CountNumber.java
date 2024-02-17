/*
Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2
*/


public class CountNumber {
    
    public static void countNumber(int[][] array) {
        int countOf7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("Number of 7's = " + countOf7);
    }

    public static void main(String[] args) {
        int[][] array = { {4,7,8},{8,8,7} };
        countNumber(array);
    }
}
