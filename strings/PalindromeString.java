import java.util.Scanner;

public class PalindromeString {
    
    public static boolean isPallindrome(String str) {
        int start = 0;
        int end = str.length() - 1 - start;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }   
    
    /* 
    public static boolean isPallindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        sc.close();
        boolean result = isPallindrome(str);
        if (result) {
            System.out.println(str + " is pallindrome");
        } else {
            System.out.println(str + " is not pallindrome");
        }
    }    
}
