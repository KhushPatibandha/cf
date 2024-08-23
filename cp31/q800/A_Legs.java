package cp31.q800;

import java.util.Scanner;

/** A_Legs */
public class A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            if (n % 4 == 0) {
                System.out.println(n / 4);
                continue;
            } else {
                n -= 2;
                System.out.println((n / 4) + 1);
                continue;
            }
        }
        sc.close();
    }
}
