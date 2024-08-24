package q900.C;

import java.util.Scanner;

/** C_RudolfAndTheUglyString */
public class C_RudolfAndTheUglyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            String str = sc.next();

            int count = 0;
            for (int i = 0; i < n - 2; i++) {
                if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i' && str.charAt(i + 2) == 'e') {
                    count++;
                    i += 2;
                } else if (str.charAt(i) == 'm'
                        && str.charAt(i + 1) == 'a'
                        && str.charAt(i + 2) == 'p') {
                    count++;
                    i += 2;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
