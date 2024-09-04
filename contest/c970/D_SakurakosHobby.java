package contest.c970;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** D */
public class D_SakurakosHobby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] perm = new int[n];
            for (int i = 0; i < n; i++) {
                perm[i] = sc.nextInt() - 1;
            }
            String s = sc.next();

            int[] f = new int[n];
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    List<Integer> cycle = new ArrayList<>();
                    int current = i;
                    int blackCount = 0;
                    while (!visited[current]) {
                        visited[current] = true;
                        cycle.add(current);
                        if (s.charAt(current) == '0') {
                            blackCount++;
                        }
                        current = perm[current];
                    }
                    for (int index : cycle) {
                        f[index] = blackCount;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
