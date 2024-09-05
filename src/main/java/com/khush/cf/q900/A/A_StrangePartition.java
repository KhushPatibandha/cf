package com.khush.cf.q900.A;

import java.util.Scanner;

public class A_StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] arr = new long[n];
            long sum2 = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum2 += (arr[i] + x - 1) / x;
                sum += arr[i];
            }

            long minPartition = (sum + x - 1) / x;
            System.out.println(minPartition + " " + sum2);
        }
        sc.close();
    }
}
