package com.khush.cf.contest.c972;

import java.util.Scanner;

/** B */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            int dp = sc.nextInt();

            int d1 = Math.min(a[0], a[1]);
            int d2 = Math.max(a[0], a[1]);

            if (dp < d1) {
                // david is on far left
                System.out.println(d1 - 1);
            } else if (dp > d2) {
                // david is on far right
                System.out.println(n - d2);
            } else {
                int mid = (a[0] + a[1]) / 2;
                System.out.println(Math.min(Math.abs(mid - a[0]), Math.abs(mid - a[1])));
            }
        }
        sc.close();
    }
}
