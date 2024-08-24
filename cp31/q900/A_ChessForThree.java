package cp31.q900;

import java.util.Scanner;

/** A_ChessForThree */
public class A_ChessForThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a + b + c) % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int max = getMax(a, b, c);
            int min = getMin(a, b, c);
            int mid = getMid(a, b, c);

            int dCount = 0;
            while (min != 0 && mid != 0 && max != 0) {
                // System.out.println("min: " + min);
                // System.out.println("mid: " + mid);
                // System.out.println("max: " + max);

                int origMin = min;
                int origMid = mid;
                int origMax = max;

                min--;
                max--;
                dCount++;

                max = getMax(origMin - 1, origMid, origMax - 1);
                min = getMin(origMin - 1, origMid, origMax - 1);
                mid = getMid(origMin - 1, origMid, origMax - 1);
            }

            if (mid > 0 && max > 0) {
                dCount += mid;
            }

            System.out.println(dCount);
        }
        sc.close();
    }

    public static int getMax(int a, int b, int c) {
        int max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }

    public static int getMin(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }

    public static int getMid(int a, int b, int c) {
        int mid = -1;
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            mid = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            mid = b;
        } else {
            mid = c;
        }
        return mid;
    }
}
