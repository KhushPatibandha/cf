package com.khush.cf.q1000.C;

import java.util.Scanner;

/** C_SkiResort */
public class C_SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int left = 0;
            int right = 0;
            long res = 0;
            while (right < n) {
                if (left == right && a[right] > q) {
                    left++;
                    right++;
                } else if (a[right] <= q) {
                    right++;
                } else {
                    int len = right - 1 - left + 1;
                    if (len >= k) {
                        long dif = len - k;
                        long d = dif + 1;
                        res += (d * (d + 1)) / 2;
                    }
                    right++;
                    left = right;
                }
            }
            if (left != right) {
                int len = right - 1 - left + 1;
                if (len >= k) {
                    long dif = len - k;
                    long d = dif + 1;
                    res += (d * (d + 1)) / 2;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
