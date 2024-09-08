package com.khush.cf.contest.aspdc.c003;

import java.util.Scanner;

/** D */
public class D_AlphabeticalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int left = s.indexOf('a');
            if (left == -1) {
                System.out.println("NO");
                continue;
            }
            int right = left;

            boolean gotAns = false;
            for (int i = 1; i < n; i++) {
                char currLeft = 'a';
                char currRight = 'a';
                if (left > 0) {
                    currLeft = s.charAt(left - 1);
                }
                if (right < n - 1) {
                    currRight = s.charAt(right + 1);
                }
                if (currLeft == 'a' + i) {
                    left--;
                } else if (currRight == 'a' + i) {
                    right++;
                } else {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                }
            }
            if (!gotAns) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
