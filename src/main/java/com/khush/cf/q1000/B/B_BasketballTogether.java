package com.khush.cf.q1000.B;

import java.util.Arrays;
import java.util.Scanner;

/** B_BasketballTogether */
public class B_BasketballTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int cnt = 0;
        int i = n - 1;
        while (i >= 0) {
            int times = 0;
            if (d % a[i] == 0) {
                times = (d / a[i]) + 1;
            } else {
                times = (d / a[i]) + 1;
            }
            n -= times;
            if (n < 0) {
                break;
            }
            int ans = a[i] * times;
            if (ans > d) {
                cnt++;
            } else {
                break;
            }
            i--;
        }
        System.out.println(cnt);
        sc.close();
    }
}

// 180
// 50 60 70 80 90 100
