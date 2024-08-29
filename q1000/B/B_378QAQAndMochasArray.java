package q1000.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** B_378QAQAndMochasArray */
public class B_378QAQAndMochasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);
            ArrayList<Long> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % arr[0] != 0) {
                    list.add(arr[i]);
                }
            }

            boolean gotAns = false;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % list.get(0) != 0) {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                }
            }
            if (!gotAns) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}

// 7 1 9 3 5
// 1 3 5 7 9
//
// 4 12 2 6 3
// 2 3 4 6 12
// 0 0 0 0 0
