package q1000.B;

import java.util.Scanner;

/** B_ShiftsAndSorting */
public class B_ShiftsAndSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long oCnt = 0;
            long total = 0;

            int i = 0;
            while (i < s.length() && s.charAt(i) != '1') {
                i++;
            }

            if (i == s.length() - 1) {
                System.out.println(0);
                continue;
            }
            oCnt++;
            i++;

            while (i < s.length()) {
                if (s.charAt(i) == '0') {
                    total += oCnt + 1;
                } else {
                    oCnt++;
                }
                i++;
            }

            System.out.println(total);
        }
        sc.close();
    }
}
