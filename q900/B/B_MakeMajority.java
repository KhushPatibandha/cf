package q900.B;

import java.util.Scanner;

/** B_MakeMajority */
public class B_MakeMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            String str = sc.next();
            int zero = 0;
            int one = 0;
            int left = 0;
            int right = 0;

            while (right < str.length()) {
                while (left < str.length() && str.charAt(left) != '0') {
                    left++;
                    one++;
                }
                right = left;
                if (right < str.length()) {
                    while (right + 1 < str.length() && str.charAt(right + 1) != '1') {
                        right++;
                    }
                    zero++;
                    right++;
                    left = right;
                }
            }

            if (zero >= one) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
