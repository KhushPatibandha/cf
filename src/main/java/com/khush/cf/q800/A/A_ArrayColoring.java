package com.khush.cf.q800.A;

import java.util.Scanner;

public class A_ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int oddCount = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] % 2 != 0) {
                    oddCount++;
                }
            }

            if (oddCount % 2 == 0) {
                System.out.println("YES");
                continue;
            } else {
                System.out.println("NO");
                continue;
            }
        }
        sc.close();
    }
}
