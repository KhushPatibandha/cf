package com.khush.cf.q900.B;

import java.util.Scanner;

public class B_SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n * k];
            for (int i = 0; i < n * k; i++) {
                arr[i] = sc.nextInt();
            }

            int r = arr.length - 1;

            int elementsFromFront = ((n + 1) / 2) - 1;
            int elementsFromBack = n - elementsFromFront;
            long total = 0;

            // System.out.println("Element from the front: " + elementsFromFront);
            // System.out.println("Elements from the back: " + elementsFromBack);

            for (int i = 0; i < k; i++) {
                long medianEle = arr[r - elementsFromBack + 1];
                // System.out.println("median element: " + medianEle);
                r = r - elementsFromBack;
                // System.out.println("r index: " + r);
                total += medianEle;

                // System.out.println("total: " + total);
            }

            System.out.println(total);
        }
        sc.close();
    }
}
