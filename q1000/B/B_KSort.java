package q1000.B;

import java.util.PriorityQueue;
import java.util.Scanner;

/** B_KSort */
public class B_KSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            PriorityQueue<Long> pq = new PriorityQueue<>();
            long ans = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    pq.add(arr[i - 1] - arr[i]);
                    arr[i] = arr[i - 1];
                }
            }

            long done = 0;
            while (pq.size() > 0) {
                long top = pq.peek();
                top -= done;
                if (top <= 0) {
                    pq.poll();
                    continue;
                }
                ans += (pq.size() + 1) * top;
                done += top;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

// 344 12 37 60 311 613 365 328 675
// 344 344 344 344 344 613 613 613 675
// 0 +332 +307 +284 +33 0 +248 +285 0
// 0 +299 +274 +251 0 0 +215 +252 0
// 0 +84 +59 +36 0 0 0 37
// 0 +48 +23 0 0 0 0 1
// 0 +47 +22 0 0 0 0 0
// 0 +25 0 0 0 0 0 0
// 231 + 1290 + 180 + 4 + 66 + 50 = 1821
