package q900.B;

import java.util.Scanner;

/** B_NewYearsNumber */
public class B_NewYearsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int num = sc.nextInt();
            if (num < 2020) {
                System.out.println("NO");
            } else if ((num % 2020 == 0) || (num % 2021 == 0)) {
                System.out.println("YES");
            } else {
                int n = num;
                while (n >= 2020) {
                    if (n % 2020 == 0) {
                        System.out.println("YES");
                        break;
                    }
                    n -= 2021;
                }
                if (n < 2020) {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
