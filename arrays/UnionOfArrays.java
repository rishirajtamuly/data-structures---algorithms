// Union of two arrays.

import java.util.*;

public class UnionOfArrays {
    
    public static void printFinalArray(int[] finalArr) {
        for (int i : finalArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void union(int[] arrOne, int[] arrTwo) {
        int[] finalArr = new int[arrOne.length + arrTwo.length];

        for (int i = 0; i < arrOne.length; i++) {
            finalArr[i] = arrOne[i];
        }

        int k = 0;
        for (int j = arrOne.length; j < finalArr.length; j++) {
            finalArr[j] = arrTwo[k];
            k++;
        }

        printFinalArray(finalArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array : ");
        int sizeOne = sc.nextInt();
        int[] arrOne = new int[sizeOne];
        System.out.println("Enter " + sizeOne + " elements in array : ");
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = sc.nextInt();
        }

        System.out.print("Enter size of 2nd array : ");
        int sizeTwo = sc.nextInt();
        int[] arrTwo = new int[sizeTwo];
        System.out.println("Enter " + sizeTwo + " elements in array : ");
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = sc.nextInt();
        }

        sc.close();
        union(arrOne, arrTwo);
    }
}
