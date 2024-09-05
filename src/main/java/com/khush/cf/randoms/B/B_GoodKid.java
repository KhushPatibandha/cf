package com.khush.cf.randoms.B;

import java.util.Scanner;

public class B_GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
            int smallest = getSmallest(arr);
            arr[smallest]++;
            int product = 1;
            for (int j = 0; j < a; j++) {
                product *= arr[j];
            }
            System.out.println(product);
        }
        sc.close();
    }

    public static int getSmallest(int[] arr) {
        int smallestIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
}
