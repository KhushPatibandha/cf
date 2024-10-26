package com.khush.cf.contest.c972;

import java.util.Scanner;

/** A */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String v = "aeiou";
            String s = "";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < n / 5 + (i < n % 5 ? 1 : 0); j++) {
                    s += v.charAt(i);
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
