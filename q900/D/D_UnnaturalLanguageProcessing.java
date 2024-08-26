package q900.D;

import java.util.HashMap;
import java.util.Scanner;

/** D_UnnaturalLanguageProcessing */
public class D_UnnaturalLanguageProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            String str = sc.next();
            HashMap<Character, Character> map = new HashMap<>();
            map.put('a', 'V');
            map.put('e', 'V');
            map.put('b', 'C');
            map.put('c', 'C');
            map.put('d', 'C');

            StringBuilder sb = new StringBuilder();
            int left = str.length() - 1;
            int right = str.length() - 1;
            while (left >= 0) {
                char c = str.charAt(left);
                if (map.get(c) == 'V') {
                    left--;
                } else {
                    left -= 2;
                }
                sb.insert(0, "." + str.substring(left, right + 1));
                left--;
                right = left;
            }
            sb.deleteCharAt(0);
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
