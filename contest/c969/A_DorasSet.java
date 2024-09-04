package contest.c969;

import java.util.Scanner;

/** A */
public class A_DorasSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int oddCount = (r - l + 1 + (l % 2) + (r % 2)) / 2;
            System.out.println(oddCount / 3);
        }
        sc.close();
    }
}
