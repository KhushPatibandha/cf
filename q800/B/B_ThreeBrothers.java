package q800.B;

import java.util.HashSet;
import java.util.Scanner;

/** B_ThreeBrothers */
public class B_ThreeBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(sc.nextInt());
        set.add(sc.nextInt());
        if (!set.contains(1)) {
            System.out.println(1);
        } else if (!set.contains(2)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        sc.close();
    }
}
