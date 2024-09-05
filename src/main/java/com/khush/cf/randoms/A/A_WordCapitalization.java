package com.khush.cf.randoms.A;

import java.util.Scanner;

public class A_WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);
        if (c >= 97 && c <= 122) {
            c = (char) (c - 32);
        }
        System.out.println(c + str.substring(1));
        sc.close();
    }
}
