package cp31.q800;

import java.util.Scanner;

public class A_ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if(x == 1 && k == 1) {
                System.out.println("NO");
                continue;
            }

            if(k == n && x != k) {
                System.out.println("YES");
                System.out.println(1);
                System.out.println(n);
                continue;
            }

            int count = 0;
            int[] arr = new int[n];
            int num = 0;
            if(x == 1) {
                num = 2;
            } else {
                num = 1;
            }

            while(n != 0) {
                if(num == 1) {
                    count = n;
                    n = 0;
                    for(int j = 0; j < count; j++) {
                        arr[j] = 1;
                    }
                    break;
                } else {
                    n -= num;
                    arr[count] = num;
                    count++;
                    if(n == x) {
                        break;
                    }
                    if(n >= 1 && n <= k) {
                        num = n;
                    }
                }
            }

            if(n != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(count);
                for(int j = 0; j < count; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
