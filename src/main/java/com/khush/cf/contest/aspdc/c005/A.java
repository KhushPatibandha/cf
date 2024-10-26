package com.khush.cf.contest.aspdc.c005;

import java.util.Arrays;
import java.util.Scanner;

/** A */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int maxD = a[n - 1];
            int sMaxD = a[n - 2];
            int tD = maxD + sMaxD;
            int pNeed = h / tD;
            int hpLeft = h % tD;
            int cnt = pNeed * 2;
            if (hpLeft > 0) {
                if (hpLeft <= maxD) {
                    cnt += 1;
                } else {
                    cnt += 2;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
