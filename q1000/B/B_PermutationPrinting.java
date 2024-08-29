package q1000.B;

import java.util.Scanner;

/** B_PermutationPrinting */
public class B_PermutationPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = 1;
            int r = n;
            for (int i = 1; i <= n; i++) {
                if ((i & 1) == 1) {
                    System.out.print(l + " ");
                    l++;
                } else {
                    System.out.print(r + " ");
                    r--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// 4 3 2 1
//
