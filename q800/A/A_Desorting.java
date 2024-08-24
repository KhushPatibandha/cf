package q800.A;

import java.util.Scanner;

public class A_Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            if(!isSorted(arr)) {
                System.out.println(0);
            } else {
                int[] smallestDif = smallestDifference(arr);
                if(smallestDif[0] == 0) {
                    System.out.println(1);
                } else {
                    System.out.println((smallestDif[0] / 2) + 1);
                }
            }
        }
        sc.close();
    }

    public static int[] smallestDifference(int[] arr) {
        int[] smallestDif = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}; // {difference, i, j}
        for(int i = 0; i < arr.length - 1; i++) {
            int dif = Math.abs(arr[i] - arr[i+1]);
            if(dif < smallestDif[0]) {
                smallestDif[0] = dif;
                smallestDif[1] = arr[i];
                smallestDif[2] = arr[i + 1];
            } 
        }
        // System.out.println(smallestDif[0] + " " + smallestDif[1] + " " + smallestDif[2]);
        return smallestDif;
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
