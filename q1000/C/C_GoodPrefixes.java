package q1000.C;

import java.util.Scanner;

/** C_GoodPrefixes */
public class C_GoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long sum = 0;
            int max = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                max = Math.max(max, arr[i]);
                if (sum - max == max) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
