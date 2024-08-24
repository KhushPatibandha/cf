package q900.B;

import java.util.Scanner;

public class B_PermutationSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for(int i = 1; i <= n; i++) {
                ans = gcd(ans, Math.abs(i - arr[i]));
            }

            System.out.println(ans);

        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
