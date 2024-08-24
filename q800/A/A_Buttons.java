package q800.A;

import java.util.Scanner;

public class A_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int[] arr = new int[3];
            for(int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }

            int anna = arr[0] + arr[2];
            int katie = arr[1] + arr[2];

            if(anna > katie) {
                System.out.println("First");
            } else if(katie > anna) {
                System.out.println("Second");
            } else {
                if(arr[2] % 2 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
        sc.close();
    }
}
