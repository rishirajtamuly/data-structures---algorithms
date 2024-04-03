// calculate nth term in fibonacci

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fib(n));
    }
}
