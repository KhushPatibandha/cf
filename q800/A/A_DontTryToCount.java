package q800.A;

import java.util.Scanner;

public class A_DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int count = 0;
            StringBuilder sb = new StringBuilder(x);

            while(true) {
                if(sb.toString().contains(s)) {
                    break;
                }
                if(sb.length() > n*m) {
                    count = -1;
                    break;
                }
                sb.append(sb);
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
