package q1000.C;

import java.util.Scanner;

/** C_AssemblyViaRemainders */
public class C_AssemblyViaRemainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n - 1];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int[] res = new int[n];
            res[0] = 501;
            System.out.print(res[0] + " ");
            for (int i = 1; i < n; i++) {
                res[i] = res[i - 1] + a[i - 1];
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
