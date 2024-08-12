package cp31.q900;

import java.util.Scanner;

public class A_JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long res = b;
            for(int i = 0; i < n; i++) {
                res += Math.min(arr[i], a - 1);
            }
            System.out.println(res);
        }
        sc.close();
    }
}