package C;

import java.util.Scanner;

/** C_Showring */
public class C_Showring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();

            int time = 0;
            boolean ans = false;

            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (l - time >= s) {
                    ans = true;
                }

                time = r;
            }

            if (m - time >= s) {
                ans = true;
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
