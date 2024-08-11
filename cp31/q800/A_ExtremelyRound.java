package cp31.q800;

import java.util.Scanner;

public class A_ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if(n < 10) {
                System.out.println(n);
            } else if(n < 100) {
                System.out.println(9 + n / 10);
            } else if(n < 1000) {
                System.out.println(18 + n / 100);
            } else if(n < 10000) {
                System.out.println(27 + n / 1000);
            } else if(n < 100000) {
                System.out.println(36 + n / 10000);
            } else {
                System.out.println(45 + n / 100000);
            }
        }
        sc.close();
    }
}
