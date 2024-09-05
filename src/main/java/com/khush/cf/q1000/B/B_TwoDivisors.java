package com.khush.cf.q1000.B;

import java.util.Scanner;

/** B_TwoDivisors */
public class B_TwoDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b % a == 0) {
                System.out.println(b * (b / a));
            } else {
                System.out.println(b * (a / gcd(a, b)));
            }
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
