package com.khush.cf.contest.aspdc.c001;

import java.util.Scanner;

/** B_TheNewYearMeetingFriends */
public class B_TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, b);
        max = Math.max(max, c);

        int min = Math.min(a, b);
        min = Math.min(min, c);

        int mid = -1;
        if ((a > b && a < c) || (a > c && a < b)) {
            mid = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            mid = b;
        } else {
            mid = c;
        }

        int ans = 0;
        ans += max - mid;
        ans += mid - min;

        System.out.println(ans);

        sc.close();
    }
}
