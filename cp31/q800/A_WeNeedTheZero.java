package cp31.q800;

import java.util.Scanner;

public class A_WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int xor = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                xor ^= arr[j];
            }

            if(n % 2 != 0) {
                System.out.println(xor);
            } else {
                if(xor == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
            }
        }
        sc.close();
    }
}