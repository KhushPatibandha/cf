package com.khush.cf.q800.A;

import java.util.Scanner;

/** A_StrongPassword */
public class A_StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            String str = sc.next();
            boolean gotAns = false;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    int newChar = str.charAt(i) + 1;
                    if (str.charAt(i) == 'z') {
                        newChar = 97;
                    }
                    str = str.substring(0, i) + (char) newChar + str.substring(i);
                    gotAns = true;
                    break;
                }
            }
            if (gotAns) {
                System.out.println(str);
            } else {
                int newChar;
                if (str.charAt(str.length() - 1) == 'z') {
                    newChar = 97;
                } else {
                    newChar = str.charAt(str.length() - 1) + 1;
                }
                str = str.substring(0, str.length()) + (char) newChar;
                System.out.println(str);
            }
        }
        sc.close();
    }
}
