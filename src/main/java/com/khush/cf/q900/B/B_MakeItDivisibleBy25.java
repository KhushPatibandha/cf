package com.khush.cf.q900.B;

import java.util.Scanner;

public class B_MakeItDivisibleBy25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            String num = sc.next();
            String[] lastTwo = {"00", "25", "50", "75"};
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < lastTwo.length; i++) {
                int mini = ops(lastTwo[i], num);
                ans = Math.min(mini, ans);
            }
            System.out.println(ans);
        }
        sc.close();
    }

    public static int ops(String lastTwo, String num) {
        int steps = 0;
        int x = lastTwo.charAt(0);
        int y = lastTwo.charAt(1);

        int i = num.length() - 1;
        while (i > 0 && num.charAt(i) != y) {
            i--;
            steps++;
        }

        int j = i - 1;
        while (j > 0 && num.charAt(j) != x) {
            j--;
            steps++;
        }

        return steps;
    }
}
