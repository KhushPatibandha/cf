package com.khush.cf.contest.aspdc.c003;

import java.util.Scanner;
import java.util.Stack;

/** A */
public class A_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stk = new Stack<>();
        boolean gotAns = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stk.push(c);
            } else {
                if (stk.isEmpty()) {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                }
                stk.pop();
            }
        }
        if (!gotAns && stk.isEmpty()) {
            System.out.println("YES");
        } else if (!gotAns) {
            System.out.println("NO");
        }
        sc.close();
    }
}
