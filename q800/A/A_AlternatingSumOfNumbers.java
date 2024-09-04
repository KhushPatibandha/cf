package q800.A;

import java.util.Scanner;

/** A_AlternatingSumOfNumbers */
public class A_AlternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            boolean sub = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (!sub) {
                    sum += a[i];
                } else {
                    sum -= a[i];
                }
                sub = !sub;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
