// Intersection of two arrays.  a = {1, 2, 3, 4, 6, 8},  b = {3, 4, 9, 10}; a = {3, 3, 4, 10}, b = {1, 2, 3, 3, 4, 6, 8};

import java.util.*;

public class IntersectionOfArrays {
    
    public static void printFinalArray(ArrayList<Integer> finalArr) {
        System.out.println("Elements after intersection : ");
        for (Integer i : finalArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void intersection(ArrayList<Integer> arrOne, ArrayList<Integer> arrTwo) {
        ArrayList<Integer> finalArr = new ArrayList<>();
        for (int i = 0; i < arrOne.size(); i++) {
            int element = arrOne.get(i);
            for (int j = 0; j < arrTwo.size(); j++) {
                if (element == arrTwo.get(j)) {
                    arrTwo.set(j, -1);
                    finalArr.add(element);
                }   
            }
        }
        printFinalArray(finalArr);
    }
        
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in 1st array list : ");
        int n1 = sc.nextInt();
        ArrayList<Integer> arrOne = new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            arrOne.add(sc.nextInt());
        }

        System.out.print("Enter number of elements in 2nd array list : ");
        int n2 = sc.nextInt();
        ArrayList<Integer> arrTwo = new ArrayList<>();
        for (int j = 1; j <= n2; j++) {
            arrTwo.add(sc.nextInt());
        }

        sc.close();
        intersection(arrOne, arrTwo);
    }
}
