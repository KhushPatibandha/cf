package com.khush.cf.contest.c970;

import java.util.Scanner;

/** B */
public class B_SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int oCnt = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    oCnt++;
                }
            }

            if (s.charAt(0) == '0' || s.charAt(n - 1) == '0') {
                System.out.println("NO");
                continue;
            }

            if (oCnt % 4 != 0) {
                System.out.println("NO");
                continue;
            }

            int side = (oCnt / 4) + 1;
            int totalCells = side * side;
            int expectedZeros = totalCells - oCnt;
            int zCnt = n - oCnt;

            if (zCnt == expectedZeros) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
