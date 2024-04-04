// Find factorial of a given number.

import java.util.Scanner;

public class Factorial {
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = fact(n - 1);
        int fn = fnm1 * n;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " = " + fact(n));
    }
}
