public class LargestString {
 
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {    // Time complexity -> O(x * N), where 'x' is length of string
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
