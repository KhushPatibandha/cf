package com.khush.cf.q800.A;

import java.util.Scanner;

/** A_ClosestPoint */
public class A_ClosestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 2) {
                if (Math.abs(a[1] - a[0]) > 1) {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
        sc.close();
    }
}
