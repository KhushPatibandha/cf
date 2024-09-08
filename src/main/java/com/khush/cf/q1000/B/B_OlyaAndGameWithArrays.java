package com.khush.cf.q1000.B;

import java.util.Arrays;
import java.util.Scanner;

/** B_OlyaAndGameWithArrays */
public class B_OlyaAndGameWithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long sum = 0;
            long sMin = Long.MAX_VALUE;
            long min = Long.MAX_VALUE;
            while (n-- > 0) {
                int m = sc.nextInt();
                long[] a = new long[m];
                for (int i = 0; i < m; i++) {
                    a[i] = sc.nextLong();
                }
                Arrays.sort(a);
                min = Math.min(a[0], min);
                sum += a[1];
                sMin = Math.min(a[1], sMin);
            }
            System.out.println(sum - sMin + min);
        }
        sc.close();
    }
}
