package cp31.q800;

import java.util.Scanner;

public class A_OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int twos = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if(arr[j] == 2) {
                    twos++;
                }
            }

            if(twos == 0) {
                System.out.println(1);
                continue;
            }
            
            if(twos % 2 != 0) {
                System.out.println(-1);
                continue;
            } else {
                int num = twos / 2;
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == 2) {
                        num--;
                    }
                    if(num == 0) {
                        System.out.println(j + 1);
                        break;
                    }
                }
                continue;
            }
        }
        sc.close();
    }
}
