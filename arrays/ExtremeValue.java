/* 
Program to print extreme value in an array.
I/P --> {1, 2, 3, 4, 5, 6, 7, 8}
O/P --> {1, 8, 2, 7, 3, 6, 4, 5}

I/P --> {10, 20, 30, 40, 50, 60, 70, 80}
O/P --> {10, 80, 20, 70, 30, 60, 40, 50}
*/

public class ExtremeValue {

    public static void printExtremeElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            System.out.print(arr[start] + " " + arr[end] + " ");
            start++;
            end--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printExtremeElement(arr);

        int[] num = {10, 20, 30, 40, 50, 60, 70, 80};
        printExtremeElement(num);
    }    
}
