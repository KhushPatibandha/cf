package com.khush.cf.q1000.B;

import java.util.Arrays;
import java.util.Scanner;

/** B_Monsters */
public class B_Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Pair[] list = new Pair[n];
            for (int i = 0; i < n; i++) {
                if (a[i] % k == 0) {
                    list[i] = new Pair(k, i);
                } else {
                    list[i] = new Pair(a[i] % k, i);
                }
            }
            Arrays.sort(
                    list,
                    (p1, p2) -> {
                        if (p1.health == p2.health) {
                            return p1.index - p2.index;
                        }
                        return p2.health - p1.health;
                    });

            for (int i = 0; i < n; i++) {
                System.out.print(list[i].index + 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

class Pair {
    int health;
    int index;

    public Pair(int health, int index) {
        this.health = health;
        this.index = index;
    }
}
