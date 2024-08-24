package q800.A;

import java.util.Scanner;

public class A_UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int negCount = 0;
            int posCount = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if(arr[j] < 0) {
                    negCount++;
                } else {
                    posCount++;
                }
            }

            if(negCount <= posCount) {
                if(negCount % 2 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                int count = negCount - (n / 2);
                negCount -= count;
                if(negCount % 2 != 0) {
                    count++;
                    System.out.println(count);
                } else {
                    System.out.println(count);
                }
            }

        }
        sc.close();
    }
}
