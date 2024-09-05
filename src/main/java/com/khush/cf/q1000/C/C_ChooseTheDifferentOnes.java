package com.khush.cf.q1000.C;

import java.util.HashSet;
import java.util.Scanner;

/** C_ChooseTheDifferentOnes */
public class C_ChooseTheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if (k / 2 > n || k / 2 > m) {
                System.out.println("NO");
                continue;
            }

            HashSet<Integer> a = new HashSet<>();
            HashSet<Integer> b = new HashSet<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }

            int aCnt = 0;
            int bCnt = 0;

            boolean gotAns = false;
            for (int i = 1; i <= k; i++) {
                if (a.contains(i) && b.contains(i)) {
                    aCnt++;
                    bCnt++;
                } else if (a.contains(i)) {
                    aCnt++;
                } else if (b.contains(i)) {
                    bCnt++;
                } else {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                }
            }

            if (!gotAns) {
                if ((aCnt >= k / 2) && (bCnt >= k / 2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
