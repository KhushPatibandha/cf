package q1000.B;

import java.util.Scanner;

/** B_SwapAndDelete */
public class B_SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int o = 0;
            int z = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    z++;
                } else {
                    o++;
                }
            }
            if (o == z) {
                System.out.println(0);
                continue;
            }

            int n = s.length();
            int i;
            for (i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    if (o > 0) {
                        o--;
                    } else {
                        break;
                    }
                } else {
                    if (z > 0) {
                        z--;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(n - i);
        }
        sc.close();
    }
}
