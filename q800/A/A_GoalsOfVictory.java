package q800.A;

import java.util.Scanner;

public class A_GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = 0;

            for(int j = 0; j < n - 1; j++) {
                x += sc.nextInt();
            }
            System.out.println(-x);
        }
        sc.close();
    }
}
