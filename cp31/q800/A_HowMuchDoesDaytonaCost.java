package cp31.q800;

import java.util.Scanner;

public class A_HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for(int j = 0; j < n; j++) {
                if(arr[j] == k) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println("NO");
            }   
        }
        sc.close();
    }
}