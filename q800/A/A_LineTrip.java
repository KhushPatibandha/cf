package q800.A;

import java.util.Scanner;

public class A_LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int maxFuel = Math.max(arr[0] - 0, (x - arr[n - 1]) * 2);
            for(int j = 0; j < arr.length - 1; j++) {
                int fuel = arr[j + 1] - arr[j];
                maxFuel = Math.max(maxFuel, fuel);
            }
            System.out.println(maxFuel);
        }
        sc.close();
    }
}
