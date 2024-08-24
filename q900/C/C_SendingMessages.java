package q900.C;

import java.util.Scanner;

/** C_SendingMessages */
public class C_SendingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        sc.close();
    }
}
