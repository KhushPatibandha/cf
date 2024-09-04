package contest.c969;

import java.util.Scanner;

public class B_IndexAndMaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int maxEle = 0;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                maxEle = Math.max(maxEle, val);
            }

            for (int i = 0; i < m; i++) {
                char op = sc.next().charAt(0);
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (l <= maxEle && maxEle <= r) {
                    if (op == '+') {
                        maxEle++;
                    } else {
                        maxEle--;
                    }
                }
                result.append(maxEle).append(" ");
            }

            result.append("\n");
        }

        System.out.print(result.toString());
        sc.close();
    }
}
