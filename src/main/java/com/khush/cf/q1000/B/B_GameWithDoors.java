package com.khush.cf.q1000.B;

import java.util.Scanner;

/** B_GameWithDoors */
public class B_GameWithDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a > d || c > b) {
                System.out.println(1);
            } else if (a == d || b == c) {
                System.out.println(2);
            } else if (a > c) {
                if (d < b) {
                    System.out.println(d - a + 2);
                } else if (d == b) {
                    System.out.println(b - a + 1);
                } else if (d > b) {
                    System.out.println(b - a + 2);
                }
            } else if (a == c) {
                if (d < b) {
                    System.out.println(d - a + 1);
                } else if (d == b) {
                    System.out.println(b - a);
                } else if (d > b) {
                    System.out.println(b - a + 1);
                }
            } else if (a < c) {
                if (d < b) {
                    System.out.println(d - c + 2);
                } else if (d == b) {
                    System.out.println(d - c + 1);
                } else if (d > b) {
                    System.out.println(b - c + 2);
                }
            }
        }
        sc.close();
    }
}
