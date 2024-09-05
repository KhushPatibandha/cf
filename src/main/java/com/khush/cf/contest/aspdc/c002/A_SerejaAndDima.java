package com.khush.cf.contest.aspdc.c002;

import java.util.Scanner;

public class A_SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0;
        int b = 0;
        int left = 0;
        int right = arr.length - 1;

        boolean leftTurn = true;
        while (left <= right) {
            if (arr[right] > arr[left]) {
                if (leftTurn) {
                    a += arr[right];
                } else {
                    b += arr[right];
                }
                right--;
                leftTurn = !leftTurn;
            } else {
                if (leftTurn) {
                    a += arr[left];
                } else {
                    b += arr[left];
                }
                left++;
                leftTurn = !leftTurn;
            }
        }
        System.out.println(a + " " + b);
        sc.close();
    }
}
