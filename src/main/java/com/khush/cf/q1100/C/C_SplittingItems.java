package com.khush.cf.q1100.C;

import java.util.Arrays;
import java.util.Scanner;

/** C_SplittingItems */
public class C_SplittingItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int ans = 0;
            for (int i = n - 2; i >= 0; i -= 2) {
                if (a[i] < a[i + 1]) {
                    int dif = a[i + 1] - a[i];
                    if (dif <= k) {
                        k -= dif;
                    } else {
                        ans += dif - k;
                        k = 0;
                    }
                }
            }

            if (n % 2 != 0) {
                ans += a[0];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
