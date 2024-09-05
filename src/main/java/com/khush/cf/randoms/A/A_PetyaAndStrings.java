package com.khush.cf.randoms.A;

import java.util.Scanner;

public class A_PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.compareTo(str2) < 0) {
            System.out.println("-1");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}
