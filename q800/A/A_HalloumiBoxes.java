package q800.A;

import java.util.Scanner;

public class A_HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            boolean isSorted = isSorted(arr);

            if(k == 1) {
                if(isSorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if(k > 1) {
                System.out.println("YES");
            }
        }
        sc.close();
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

