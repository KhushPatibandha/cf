package com.khush.cf.q800.A;

import java.util.Scanner;

public class A_AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = getClosestToZero(arr);
        System.out.println(smallest);
        sc.close();
    }

    public static int getClosestToZero(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < smallest) {
                smallest = Math.abs(arr[i]);
            }
        }
        return smallest;
    }
}
