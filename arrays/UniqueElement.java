// Find unique element in array.

public class UniqueElement {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    
    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean unique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    i++;
                    break;
                }
            }
            if (unique) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4};
        sort(arr);
        System.out.println("Unique element in array = " + findUnique(arr));
    }
}
