// Find unique element in array.

public class UniqueElement {
    /*
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
    */
    
    public static int findUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i]; // xor operator, 0 ^ 0 = 0, 0 ^ 1 = 1
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        //sort(arr);
        System.out.println("Unique element in array = " + findUnique(arr));
    }
}
