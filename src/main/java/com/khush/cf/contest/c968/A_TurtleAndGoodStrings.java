package com.khush.cf.contest.c968;

import java.util.Scanner;

/** A */
public class A_TurtleAndGoodStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            String str = sc.next();

            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
