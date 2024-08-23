package contest.aspdc.c002;

import java.util.Scanner;

/** C_MinimalSquare */
public class C_MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int side = Math.max(min * 2, max);
            System.out.println(side * side);
        }
        sc.close();
    }
}
