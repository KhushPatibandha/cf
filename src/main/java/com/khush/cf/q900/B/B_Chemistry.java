package com.khush.cf.q900.B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            int odds = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    odds++;
                }
            }

            if (k == 0 && odds <= 1) {
                System.out.println("YES");
                continue;
            } else if (k == 0 && odds > 1) {
                System.out.println("NO");
                continue;
            }

            if (odds > k + 1) {
                System.out.println("NO");
                continue;
            } else if (odds <= k + 1) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
