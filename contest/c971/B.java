package contest.c971;

import java.util.Scanner;

/** B */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                a[i] = s.indexOf('#') + 1;
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
