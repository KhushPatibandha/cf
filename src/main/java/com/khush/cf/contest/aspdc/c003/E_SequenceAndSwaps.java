package com.khush.cf.contest.aspdc.c003;

import java.util.Scanner;

/** E */
public class E_SequenceAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean sorted = false;
            if (isSorted(a)) {
                System.out.println(0);
                continue;
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > x) {
                    int temp = x;
                    x = a[i];
                    a[i] = temp;
                    cnt++;
                    if (isSorted(a)) {
                        sorted = true;
                        break;
                    }
                }
            }

            if (!sorted) {
                System.out.println(-1);
            } else {
                System.out.println(cnt);
            }
        }
        sc.close();
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
