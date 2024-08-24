package q900.C;

import java.util.Scanner;

public class C_VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long low = (k * (k + 1)) / 2;
            long high = ((n * (n + 1)) / 2) - ((n - k) * (n - k + 1)) / 2;

            // System.out.println("low: " + low);
            // System.out.println("high: " +  high);

            if(x < low || x > high) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
