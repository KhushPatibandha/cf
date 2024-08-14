package contest.c966;

import java.util.Scanner;

public class A_PrimaryTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            String n = sc.next();
            if(n.length() < 3) {
                System.out.println("NO");
                continue;
            }
            if(n.charAt(0) != '1' || n.charAt(1) != '0') {
                System.out.println("NO");
                continue;
            }
            if(n.charAt(2) == '0' || (n.equals("101"))) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
        sc.close();
    }
}
