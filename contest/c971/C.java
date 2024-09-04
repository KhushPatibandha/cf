package contest.c971;

import java.util.Scanner;

/** C */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            int jx = (x + k - 1) / k;
            int jy = (y + k - 1) / k;

            int cnt = Math.max(2 * jx - 1, 2 * jy);

            // boolean mx = true;
            // while (x != 0 || y != 0) {
            // if (mx) {
            // if (x > k) {
            // x -= k;
            // cnt++;
            // } else if (x <= k) {
            // x = 0;
            // cnt++;
            // }
            // } else {
            // if (y > k) {
            // y -= k;
            // cnt++;
            // } else if (y <= k) {
            // y = 0;
            // cnt++;
            // }
            // }
            // mx = !mx;
            // }
            System.out.println(cnt);
        }
        sc.close();
    }
}
