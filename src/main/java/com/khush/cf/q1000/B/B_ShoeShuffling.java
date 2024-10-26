package com.khush.cf.q1000.B;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** B_ShoeShuffling */
public class B_ShoeShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            int last = Integer.MAX_VALUE;
            boolean gotAns = false;
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
                map.put(a.get(i), map.getOrDefault(a.get(i), 0) + 1);
                if (map.get(a.get(i)) == 1 && last == 1) {
                    System.out.println(-1);
                    gotAns = true;
                    break;
                }
                last = map.get(a.get(i));
            }
            if (n == 1) {
                System.out.println(-1);
                continue;
            }
            if (gotAns) {
                continue;
            }

            int left = 0;
            int right = 0;

            while (right < n) {
                right = a.lastIndexOf(a.get(left));
                for (int i = left; i < right; i++) {
                    System.out.print(i + 2 + " ");
                }
                System.out.print(left + 1 + " ");
                left = right + 1;
                right = left;
            }
            System.out.println();
        }
        sc.close();
    }
}

// 3 3 6 6 8 8 13 15 15 21 21 21
// 0 1 2 3 4 5 6 7 8 9 10 11
//
// 7
// 2 4 4 5 5 10 10
//
// 2 3 4 5 1 7 6
