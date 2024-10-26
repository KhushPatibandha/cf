package com.khush.cf.contest.aspdc.c004;

import java.util.Scanner;

/** C_OddSelection */
public class C_OddSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (odd == 0) {
                System.out.println("NO");
                continue;
            }
            if (x == n) {
                System.out.println(odd % 2 == 1 ? "YES" : "NO");
                continue;
            }

            if (x % 2 == 1) {
                if (odd >= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (odd >= 1 && even >= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}

// odd odds = odd number
// even odds = even number
// odd evens = even number
// even evens = even number
