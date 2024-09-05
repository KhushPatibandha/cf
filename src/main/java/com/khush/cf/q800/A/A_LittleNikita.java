package com.khush.cf.q800.A;

import java.util.Scanner;

/** A_LittleNikita */
public class A_LittleNikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == m) {
                System.out.println("YES");
                continue;
            } else if (n < m) {
                System.out.println("NO");
                continue;
            }

            if ((n % 2 == 0 && m % 2 == 0) || (n % 2 != 0 && m % 2 != 0)) {
                System.out.println("YES");
            } else if ((n % 2 == 0 && m % 2 != 0) || (n % 2 != 0 && m % 2 == 0)) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
