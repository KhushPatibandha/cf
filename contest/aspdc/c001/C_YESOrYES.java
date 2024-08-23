package contest.aspdc.c001;

import java.util.Scanner;

/** C_YESOrYES */
public class C_YESOrYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next().toLowerCase();
            if (str.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
