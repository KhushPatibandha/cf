package com.khush.cf.q900.B;

import java.util.Scanner;

public class B_NotDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    arr[i] = 2;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] % arr[i] == 0) {
                    arr[i + 1] += 1;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
