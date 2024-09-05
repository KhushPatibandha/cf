package com.khush.cf.randoms.D;

import java.util.Scanner;

public class D_1DEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = 0;

            int left = 0;
            int right = k - 1;
            while (left < n) {
                while (str.charAt(left) != 'B') {
                    if (left == n - 1) {
                        break;
                    }
                    left++;
                    right++;
                }
                if (str.charAt(left) == 'B') {
                    count++;
                    left = right + 1;
                    right = left + k - 1;

                    if (right > n - 1) {
                        right = n - 1;
                    }
                }
                if (left == n - 1 && str.charAt(left) != 'B') {
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
