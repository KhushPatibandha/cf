package q800.A;

import java.util.Scanner;

public class A_CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            int count = 0;

            boolean are3 = str.contains("...");
            if(are3) {
                System.out.println(2);
                continue;
            } else {
                for(int j = 0; j < n; j++) {
                    if(str.charAt(j) == '.') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
