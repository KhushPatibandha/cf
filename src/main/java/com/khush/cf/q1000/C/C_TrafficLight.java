package com.khush.cf.q1000.C;

import java.util.Scanner;

/** C_TrafficLight */
public class C_TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            char curr = sc.next().charAt(0);
            String s = sc.next();
            s = s + s;
            int lastG = -1;
            int max = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c == 'g') {
                    lastG = i;
                } else if (c == curr) {
                    int dis = lastG - i;
                    max = Math.max(dis, max);
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}
// gryyyyyrrgy
