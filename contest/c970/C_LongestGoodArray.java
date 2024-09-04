package contest.c970;

import java.util.Scanner;

/** C */
public class C_LongestGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int diff = r - l;
            int left = 0, right = (int) Math.sqrt(2 * diff) + 1, k = 0;
            while (left <= right) {
                int midNum = left + (right - left) / 2;
                if (midNum * (midNum + 1) / 2 <= diff) {
                    k = midNum;
                    left = midNum + 1;
                } else {
                    right = midNum - 1;
                }
            }
            System.out.println(k + 1);
        }
        sc.close();
    }
}
