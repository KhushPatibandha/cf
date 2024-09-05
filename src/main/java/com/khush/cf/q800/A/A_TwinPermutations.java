package com.khush.cf.q800.A;

import java.util.Scanner;

public class A_TwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int[] res = new int[n];
            for (int j = 0; j < arr.length; j++) {
                res[j] = n + 1 - arr[j];
            }

            for (int j = 0; j < res.length; j++) {
                System.out.print(res[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
