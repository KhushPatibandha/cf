package contest.aspdc.c001;

import java.util.Scanner;

/** D_YetAnotherTwoIntegersProblem */
public class D_YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int dif = Math.abs(a - b);
            if (dif % 10 != 0) {
                int count = dif / 10;
                count += 1;
                System.out.println(count);
            } else {
                int count = dif / 10;
                System.out.println(count);
            }
        }
        sc.close();
    }
}
