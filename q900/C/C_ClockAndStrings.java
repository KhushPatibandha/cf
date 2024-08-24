package q900.C;

import java.util.Scanner;

/** C_ClockAndStrings */
public class C_ClockAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int maxA = Math.max(a, b);
            int minA = Math.min(a, b);

            int maxB = Math.max(c, d);
            int minB = Math.min(c, d);

            if ((maxA < maxB && maxA > minB && minA < minB)
                    || (maxA > maxB && maxB > minA && minA > minB)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
