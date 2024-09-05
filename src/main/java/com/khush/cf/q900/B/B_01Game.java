package com.khush.cf.q900.B;

import java.util.Scanner;

public class B_01Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            String str = sc.next();

            int zeroCount = 0;
            int oneCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') zeroCount++;
                else oneCount++;
            }

            if (Math.min(zeroCount, oneCount) % 2 == 0) {
                System.out.println("NET");
            } else {
                System.out.println("DA");
            }
        }
        sc.close();
    }
}
