package contest.aspdc.c001;

import java.util.HashSet;
import java.util.Scanner;

/** A_Pangram */
public class A_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(str.charAt(i));
        }
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
