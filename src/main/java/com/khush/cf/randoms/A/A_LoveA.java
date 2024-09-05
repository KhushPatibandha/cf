package com.khush.cf.randoms.A;

import java.util.Scanner;

public class A_LoveA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                countA++;
            }
        }
        if (countA > str.length() / 2) {
            System.out.println(str.length());
        } else {
            System.out.println(countA * 2 - 1);
        }
    }
}
