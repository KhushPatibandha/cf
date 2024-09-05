package com.khush.cf.q1000.C;

import java.util.Scanner;

/** C_MakeEqualAgain */
public class C_MakeEqualAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int x = 0;
            int y = n - 1;
            int topEle = -1;
            if (a[x] == a[y]) {
                topEle = a[x];
                while (x < a.length && a[x] == topEle) {
                    x++;
                }
                if (x < a.length) {
                    while (y > x && a[y] == topEle) {
                        y--;
                    }
                }
                System.out.println(y - x + 1);
            } else {
                topEle = a[x];
                while (a[x] == topEle) {
                    x++;
                }

                topEle = a[y];
                while (a[y] == topEle) {
                    y--;
                }

                int xLen = x;
                int yLen = n - y - 1;

                if (xLen > yLen) {
                    y = n - 1;
                    System.out.println(y - x + 1);
                } else if (yLen > xLen) {
                    x = 0;
                    System.out.println(y - x + 1);
                } else {
                    y = n - 1;
                    System.out.println(y - x + 1);
                }
            }
        }
        sc.close();
    }
}

// 11
// 9 9 9 9 2 5 5 5 3 3 3
// 0 1 2 3 4 5 6 7 8 9 10
