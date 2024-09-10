package com.khush.cf.q1000.D;

import java.util.HashSet;
import java.util.Scanner;

/** D_DistinctSplit */
public class D_DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<Character> set = new HashSet<>();
            int[] prefix = new int[n];
            for (int i = 0; i < n; i++) {
                set.add(s.charAt(i));
                prefix[i] = set.size();
            }

            HashSet<Character> set2 = new HashSet<>();
            int[] suffix = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                set2.add(s.charAt(i));
                suffix[i] = set2.size();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                int sum = prefix[i] + suffix[i + 1];
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}

// paiumoment
// prefix = 1 2 3 4 5 6 6 7 8 9
// suffix = 9 8 7 6 5 5 4 3 2 1
//
// aazz
// prefix = 1 1 2 2
// suffix = 2 2 1 1
//
// abcabcd
// prefix = 1 2 3 3 3 3 4
// suffix = 4 4 4 4 3 2 1
