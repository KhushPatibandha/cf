package com.khush.cf.contest.c972;

import java.util.Arrays;
import java.util.Scanner;

/** C */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();

            int[] tSpot = new int[m];
            for (int i = 0; i < m; i++) {
                tSpot[i] = sc.nextInt();
            }
            int[] dSpot = new int[q];
            for (int i = 0; i < q; i++) {
                dSpot[i] = sc.nextInt();
            }

            Arrays.sort(tSpot);

            int l = 0;
            while (l < q) {
                if (dSpot[l] < tSpot[0]) {
                    System.out.println(tSpot[0] - 1);
                    l++;
                    continue;
                } else if (dSpot[l] > tSpot[m - 1]) {
                    System.out.println(n - tSpot[m - 1]);
                    l++;
                    continue;
                } else {
                    // get 2 closet and do binary search
                    int[] closestPair = findClosestPair(tSpot, dSpot[l]);
                    int d1 = closestPair[0];
                    int d2 = closestPair[1];

                    int mid = (d1 + d2) / 2;
                    System.out.println(Math.min(Math.abs(mid - d1), Math.abs(mid - d2)));
                    l++;
                }
            }
        }
        sc.close();
    }

    public static int[] findClosestPair(int[] arr, int target) {
        int n = arr.length;
        int closest1 = -1, closest2 = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int average = (arr[i] + arr[j]) / 2;

                int diff = Math.abs(average - target);

                if (diff < minDiff) {
                    minDiff = diff;
                    closest1 = arr[i];
                    closest2 = arr[j];
                }
            }
        }

        return new int[] {closest1, closest2};
    }
}

// package com.khush.cf.contest.c972;

// import java.util.Scanner;

// /** B */
// public class B {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t-- > 0) {
// int n = sc.nextInt();
// int m = sc.nextInt();
// int q = sc.nextInt();
// int[] a = new int[2];
// a[0] = sc.nextInt();
// a[1] = sc.nextInt();
// int dp = sc.nextInt();

// int d1 = Math.min(a[0], a[1]);
// int d2 = Math.max(a[0], a[1]);

// if (dp < d1) {
// // david is on far left
// System.out.println(d1 - 1);
// } else if (dp > d2) {
// // david is on far right
// System.out.println(n - d2);
// } else {
// int mid = (a[0] + a[1]) / 2;
// System.out.println(Math.min(Math.abs(mid - a[0]), Math.abs(mid - a[1])));
// }
// }
// sc.close();
// }
// }
