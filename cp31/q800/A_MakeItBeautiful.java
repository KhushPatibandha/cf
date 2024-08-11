package cp31.q800;

import java.util.Scanner;

public class A_MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if(arr[0] == arr[arr.length - 1]) {
                System.out.println("NO");
                continue;
            }

            int[] res = new int[n];
            res[0] = arr[arr.length - 1];
            for(int j = 1; j < n; j++) {
                res[j] = arr[j - 1];
            }

            System.out.println("YES");
            for(int j = 0; j < n; j++) {
                System.out.print(res[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
