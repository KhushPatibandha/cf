package com.khush.cf.randoms.G;

import java.util.Scanner;

public class G_ABBCOrBACB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();

            int count = 0;
            boolean again = false;

            // AB -> BC
            // BA -> CB

            for (int j = str.length() - 2; j >= 0; j--) {
                if (str.charAt(j) == 'A' && str.charAt(j + 1) == 'B') {
                    str = str.substring(0, j) + "BC" + str.substring(j + 2);
                    count++;
                    again = true;
                } else if (str.charAt(j) == 'B' && str.charAt(j + 1) == 'A') {
                    str = str.substring(0, j) + "CB" + str.substring(j + 2);
                    count++;
                    again = true;
                }
                if (again) {
                    j = str.length() - 1;
                    again = false;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
