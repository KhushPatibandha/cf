package com.khush.cf.q900.D;

import java.util.Arrays;
import java.util.Scanner;

public class D_BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int l = 0;
            int r = 0;
            int maxCount = 0;
            int count = 1;

            while (r < n - 1) {
                if (Math.abs(arr[r] - arr[r + 1]) <= k) {
                    r++;
                } else {
                    count = r - l + 1;
                    r++;
                    l = r;
                    if (maxCount < count) {
                        maxCount = count;
                    }
                }
            }
            count = r - l + 1;
            r++;
            l = r;
            if (maxCount < count) {
                maxCount = count;
            }
            // System.out.println(maxCount + " m c");
            System.out.println(n - maxCount);
        }
        sc.close();
    }
}
