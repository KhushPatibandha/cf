package com.khush.cf.contest.c970;

import java.util.Scanner;

/** A */
public class A_SakurakosExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            if (a % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println("YES");
            } else {
                a += 2;
                b--;
                if (a >= 0 && b >= 0 && a % 2 == 0 && b % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
