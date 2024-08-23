package cp31.q900;

import java.util.Scanner;

/** B_MakeItIncreasing */
public class B_MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }

            int count = 0;
            boolean gotAns = false;
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] == 0) {
                    System.out.println(-1);
                    gotAns = true;
                    break;
                }
                while (arr[j - 1] > 0 && arr[j] <= arr[j - 1]) {
                    arr[j - 1] /= 2;
                    count++;
                }
            }
            if (!gotAns) {
                System.out.println(count);
            }
        }
        sc.close();
    }
}
