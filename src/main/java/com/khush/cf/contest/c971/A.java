package com.khush.cf.contest.c971;

import java.util.Scanner;

/** A */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a;
            System.out.println((c - a) + (b - c));
        }
        sc.close();
    }
}
