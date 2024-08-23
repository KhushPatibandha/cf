package contest.aspdc.c002;

import java.util.Scanner;

/** B_DislikeOfThrees */
public class B_DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int k = sc.nextInt();
            int count = 0;
            int i = 0;
            while (true) {
                if (i % 3 != 0 && i % 10 != 3) {
                    count++;
                }
                if (count == k) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
        sc.close();
    }
}
