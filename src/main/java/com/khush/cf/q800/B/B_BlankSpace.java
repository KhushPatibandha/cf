package com.khush.cf.q800.B;

import java.util.Scanner;

public class B_BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int maxCount = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    count++;
                } else {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                    count = 0;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            System.out.println(maxCount);
        }
        sc.close();
    }
}
