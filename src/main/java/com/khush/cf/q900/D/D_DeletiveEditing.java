package com.khush.cf.q900.D;

import java.util.HashMap;
import java.util.Scanner;

/** D_DeletiveEditing */
public class D_DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int p = 0; p < c; p++) {
            String s = sc.next();
            String t = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
            }
            int ptr = t.length() - 1;
            boolean gotAns = false;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (ptr == -1) {
                    break;
                }
                char ch = s.charAt(i);
                char cht = t.charAt(ptr);
                if (ch != cht && map.containsKey(ch)) {
                    System.out.println("NO");
                    gotAns = true;
                    break;
                } else if (ch == cht) {
                    ptr--;
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0) {
                        map.remove(ch);
                    }
                }
            }
            if (map.size() > 0 && !gotAns) {
                System.out.println("NO");
                continue;
            }
            if (!gotAns) {
                System.out.println("YES");
                continue;
            }
        }
        sc.close();
    }
}
