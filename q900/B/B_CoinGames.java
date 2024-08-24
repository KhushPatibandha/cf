package q900.B;

import java.util.Scanner;

/** B_CoinGames */
public class B_CoinGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            String str = sc.next();
            int ucnt = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'U') {
                    ucnt++;
                }
            }
            if (ucnt % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
