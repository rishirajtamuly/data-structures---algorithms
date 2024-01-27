// Program to find a key in an array using binary search. Return index if key is found else return -1.

import java.util.*;

public class BinarySearch {
    
    public static int search(ArrayList<Integer> arrayList, int key) {
        int start = 0;
        int end = arrayList.size() - 1;

        while (start <= end) {
            int mid = (start + end)/2;
            if (key == arrayList.get(mid)) {
                return mid;
            } else if (key < arrayList.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array list : ");
        int size = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter " + size + " elements in array list : ");
        for (int i = 1; i <= size; i++) {
            arrayList.add(sc.nextInt());
        }

        System.out.print("Enter key to search : ");
        int key = sc.nextInt();
        sc.close();

        int result = search(arrayList, key);
        if (result == -1) {
            System.out.println("Element not present in the array list");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

