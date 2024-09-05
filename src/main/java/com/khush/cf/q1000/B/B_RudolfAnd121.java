package com.khush.cf.q1000.B;

import java.util.Scanner;

/** B_RudolfAnd121 */
public class B_RudolfAnd121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean gotAns = false;
            for (int i = 0; i < n - 2; i++) {
                if (a[i] == 0) {
                    continue;
                } else if (a[i] < 0) {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                } else {
                    a[i + 1] -= 2 * a[i];
                    a[i + 2] -= a[i];
                }
            }

            if (!gotAns) {
                if ((a[n - 1] == 0 && a[n - 2] == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
