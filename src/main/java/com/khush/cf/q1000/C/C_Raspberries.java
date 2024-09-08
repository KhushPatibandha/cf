package com.khush.cf.q1000.C;

import java.util.Scanner;

/** C_Raspberries */
public class C_Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            int d = k - 1;
            int evenCnt = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    evenCnt++;
                }

                if (a[i] % k == 0) {
                    d = 0;
                } else {
                    d = Math.min(d, k - a[i] % k);
                }
            }

            if (k != 4) {
                System.out.println(d);
            } else {
                if (evenCnt >= 2) {
                    System.out.println(0);
                } else if (evenCnt == 1) {
                    System.out.println(Math.min(d, 1));
                } else {
                    System.out.println(Math.min(2, d));
                }
            }
        }
        sc.close();
    }
}
