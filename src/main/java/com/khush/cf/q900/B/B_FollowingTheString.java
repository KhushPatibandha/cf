package com.khush.cf.q900.B;

import java.util.Scanner;

/** B_FollowingTheString */
public class B_FollowingTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] chars = new int[26];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == arr[i]) {
                        chars[j]++;
                        break;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] - 1 == arr[i]) {
                        sb.insert(0, (char) (j + 'a'));
                        chars[j]--;
                        break;
                    }
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
