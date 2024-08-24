package A;

import java.util.Scanner;

public class A_ShortSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("abc")) {
                System.out.println("YES");
            } else {
                if (swapChar(str, 'a', 'b') || swapChar(str, 'b', 'c') || swapChar(str, 'a', 'c')) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    public static Boolean swapChar(String str, char x, char y) {
        char[] arr = str.toCharArray();
        int xIdx = str.indexOf(x);
        int yIdx = str.indexOf(y);

        char temp = arr[xIdx];
        arr[xIdx] = arr[yIdx];
        arr[yIdx] = temp;

        String r = new String(arr);

        if (r.equals("abc")) {
            return true;
        } else {
            return false;
        }
    }
}
