package contest.c968;

import java.util.Arrays;
import java.util.Scanner;

/** B */
public class B_TurtleAndPiggyArePlayingAGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start) / 2;

            if (arr.length % 2 == 0) {
                System.out.println(arr[mid + 1]);
            } else {
                System.out.println(arr[mid]);
            }
        }
        sc.close();
    }
}

// 10 2 5 2 7 9 2 5 10 7
//
// 2 2 2 5 5 7 7 9 10 10
//
//
// 3 1 2 2 3
// 1 2 2 3 3
