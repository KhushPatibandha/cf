package com.khush.cf.q900.A;

import java.util.Scanner;

/** A_DualTrigger */
public class A_DualTrigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            String num = sc.next();

            int oCnt = 0;
            for (int i = 0; i < n; i++) {
                if (num.charAt(i) == '1') {
                    oCnt++;
                }
            }
            if ((oCnt == 0) || (oCnt >= 4 && oCnt % 2 == 0)) {
                System.out.println("YES");
            } else if (oCnt == 2) {
                int firstIdx = num.indexOf('1');
                int lastIdx = num.lastIndexOf('1');
                if (lastIdx == firstIdx + 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
