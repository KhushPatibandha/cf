package com.khush.cf.q900.C;

import java.util.Scanner;

public class C_SendingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long[] arr = new long[n + 1];
            arr[0] = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextLong();
            }
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                long timeOn = arr[i + 1] - arr[i];
                long chargeUsed = Math.min(timeOn * a, b);
                f -= chargeUsed;
                if (f <= 0) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
