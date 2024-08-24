package q800.C;

import java.util.Scanner;

public class C_PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            if (str.length() != n) {
                System.out.println(0);
            }
            int l = 0;
            int r = str.length() - 1;

            while (str.charAt(l) != str.charAt(r) && l < r) {
                l++;
                r--;
            }
            System.out.println(r - l + 1);
        }
        sc.close();
    }
}
