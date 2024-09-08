package com.khush.cf.q1000.B;

import java.util.Scanner;
import java.util.Stack;

/** B_YetnottherrokenKeord */
public class B_YetnottherrokenKeord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] s = sc.next().toCharArray();
            int n = s.length;

            Stack<Integer> upper = new Stack<>();
            Stack<Integer> lower = new Stack<>();

            for (int i = 0; i < n; i++) {
                if (s[i] == 'b') {
                    s[i] = ' ';
                    if (!lower.isEmpty()) {
                        s[lower.pop()] = ' ';
                    }
                    continue;
                } else if (s[i] == 'B') {
                    s[i] = ' ';
                    if (!upper.isEmpty()) {
                        s[upper.pop()] = ' ';
                    }
                    continue;
                }

                if (Character.isUpperCase(s[i])) {
                    upper.push(i);
                } else {
                    lower.push(i);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : s) {
                if (c != ' ') {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
