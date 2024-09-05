package com.khush.cf.randoms.A;

import java.util.Scanner;

public class A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 5) {
            n -= 5;
            count++;
        }
        System.out.println(count + 1);
        sc.close();
    }
}
