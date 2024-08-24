package q800.A;

import java.util.Scanner;

public class A_GrasshopperOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int k = sc.nextInt();

            int moves = 0;
            int[] arr = new int[x];
            int num = x;

            while(x != 0) {
                if(num % k != 0) {
                    arr[moves] = num;
                    moves++;
                    x -= num;
                    if(x >= 1 && x <= 100) {
                        num = x;
                    }
                } else {
                    num--;
                }
            }

            System.out.println(moves);
            for(int j = 0; j < moves; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
