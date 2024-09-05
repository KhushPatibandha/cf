package com.khush.cf.q800.A;

import java.util.Arrays;
import java.util.Scanner;

/** A_OnlyPluses */
public class A_OnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            int n = 5;
            while (n > 0) {
                Arrays.sort(a);
                a[0] += 1;
                n--;
            }
            System.out.println(a[1] * a[0] * a[2]);
        }
        sc.close();
    }
}
