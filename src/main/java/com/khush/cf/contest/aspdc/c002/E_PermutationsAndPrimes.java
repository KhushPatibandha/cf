package com.khush.cf.contest.aspdc.c002;

import java.util.Scanner;

/** E_PermutationsAndPrimes */
public class E_PermutationsAndPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
                continue;
            } else if (n == 2) {
                System.out.println("1 2");
                continue;
            }

            int[] result = new int[n];
            int left = 0;
            int right = n - 1;
            int mid = left - (left - right) / 2;
            result[mid] = 1;
            if (n >= 3) {
                result[0] = 2;
                result[n - 1] = 3;

                int num = 4;
                for (int i = 1; i < n - 1; i++) {
                    if (i == mid) {
                        continue;
                    }
                    result[i] = num;
                    num++;
                }
            }

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
