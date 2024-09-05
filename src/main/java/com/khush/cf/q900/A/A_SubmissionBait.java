package com.khush.cf.q900.A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** A_SubmissionBait */
public class A_SubmissionBait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            boolean gotAns = false;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println("YES");
                    gotAns = true;
                    break;
                }
            }

            if (!gotAns) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
