package A;

import java.util.Scanner;

public class A_APlusBAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = a % 10;
            a /= 10;
            System.out.println(a + b);
        }
        sc.close();
    }
}
