package q800.A;

import java.util.Scanner;

public class A_TwoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a + b >= n - 1) {
                if(a == n && b == n) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
