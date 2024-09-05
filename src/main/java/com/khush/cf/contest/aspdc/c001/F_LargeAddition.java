package com.khush.cf.contest.aspdc.c001;

import java.util.Scanner;

/** F_LargeAddition */
public class F_LargeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String num = sc.next();
            boolean gotAns = false;
            if (num.charAt(0) != '1') {
                System.out.println("NO");
                continue;
            } else {
                if (num.charAt(num.length() - 1) == '9') {
                    System.out.println("NO");
                    continue;
                }

                for (int i = 1; i < num.length() - 1; i++) {
                    if (num.charAt(i) == '0') {
                        System.out.println("NO");
                        gotAns = true;
                        break;
                    }
                }
            }
            if (!gotAns) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
