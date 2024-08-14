package contest.c966;

import java.util.HashSet;
import java.util.Scanner;

public class B_SeatingInABus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean valid = true;

            set.add(sc.nextInt());

            for(int i = 1; i < n; i++) {
                int num = sc.nextInt();
                set.add(num);
                if((set.contains(num - 1) || set.contains(num + 1))) {
                    continue;
                } else {
                    valid = false;
                }
            }

            if(!valid) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }    
}
