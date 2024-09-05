package com.khush.cf.contest.aspdc.c002;

import java.util.Scanner;

/** D_MinutesBeforeTheNewYear */
public class D_MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int minutes = 0;
            if (h == 0) {
                minutes = 1440 - m;
            } else {
                minutes = (23 - h) * 60 + (60 - m);
            }
            System.out.println(minutes);
        }
        sc.close();
    }
}
