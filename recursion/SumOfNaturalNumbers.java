// Sum of N natural numbers.

import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }

        int snm1 = calcSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + calcSum(n));
    }
}
