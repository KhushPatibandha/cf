package com.khush.cf.randoms.A;

import java.util.Scanner;

public class A_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            char c = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if (c == c2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
