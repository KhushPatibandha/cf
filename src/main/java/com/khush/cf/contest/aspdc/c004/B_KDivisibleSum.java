package com.khush.cf.contest.aspdc.c004;

import java.util.Scanner;

/** B_KDivisibleSum */
public class B_KDivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n == k) {
                System.out.println(1);
            } else if (n == 1) {
                System.out.println(k);
            } else {
                long x = ((n + k - 1) / k) * k;
                System.out.println((x + n - 1) / n);
            }
        }
        sc.close();
    }
}

// n = 8, k = 17
// 2 2 2 2 2 2 2 3
