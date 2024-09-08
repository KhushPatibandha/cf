package com.khush.cf.q1000.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/** A_HelmetsInNightLight */
public class A_HelmetsInNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            ArrayList<Pair> list = new ArrayList<>();
            list.add(new Pair(n + 1, p));
            for (int i = 0; i < n; i++) {
                list.add(new Pair(a[i], b[i]));
            }

            Comparator<Pair> comparator =
                    new Comparator<Pair>() {
                        @Override
                        public int compare(Pair o1, Pair o2) {
                            return (int) (o1.cost - o2.cost);
                        }
                    };
            list.sort(comparator);

            // for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i).quantity + " " + list.get(i).cost);
            // }

            long ans = p;
            int total = 1;
            int idx = 0;
            while (total < n) {
                int left = n - total;
                if (list.get(idx).quantity <= left) {
                    total += list.get(idx).quantity;
                    ans += list.get(idx).quantity * list.get(idx).cost;
                } else {
                    total = n;
                    ans += left * list.get(idx).cost;
                }
                idx++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

class Pair {
    long quantity;
    long cost;

    public Pair(long quantity, long cost) {
        this.quantity = quantity;
        this.cost = cost;
    }
}
