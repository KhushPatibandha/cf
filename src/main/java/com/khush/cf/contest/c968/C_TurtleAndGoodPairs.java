package com.khush.cf.contest.c968;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/** C */
public class C_TurtleAndGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            ArrayList<Character> chars = new ArrayList<>(freqMap.keySet());
            Collections.sort(chars, (a, b) -> freqMap.get(b) - freqMap.get(a));

            char[] result = new char[n];
            int index = 0;

            for (char c : chars) {
                int count = freqMap.get(c);
                for (int i = 0; i < count; i++) {
                    if (index >= n) {
                        index = 1;
                    }
                    result[index] = c;
                    index += 2;
                }
            }

            System.out.println(new String(result));
        }
        sc.close();
    }
}
