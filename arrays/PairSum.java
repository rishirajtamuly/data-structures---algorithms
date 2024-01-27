/*  Find a pair that upon addition gives value equal to sum. 
if a[] -> {1, 3, 5, 7, 2, 4, 6}; sum = 9
3 + 6 = 9
5 + 4 = 9
7 + 2 = 9
*/

import java.util.*;

public class PairSum {
    
    public static void pair(ArrayList<Integer> arr, int sum) {
        System.out.println("Pairs in array whose sum equals to " + sum + " are : ");
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) + arr.get(j)) == sum) {
                    System.out.println("(" + arr.get(i) + ", " + arr.get(j) + ")");
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
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 1; i <= size; i++) {
            arr.add(sc.nextInt());
        }
        sc.close();
        pair(arr, sum);
    }
}
