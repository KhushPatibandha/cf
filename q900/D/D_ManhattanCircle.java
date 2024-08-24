package q900.D;

import java.util.Scanner;

/** D_ManhattanCircle */
public class D_ManhattanCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            int mid = -1;
            int maxDif = 0;
            int maxDifAt = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains("#")) {
                    // get the mid
                    int left = 0;
                    int right = m - 1;
                    while (arr[i].charAt(left) != '#') {
                        left++;
                    }
                    while (arr[i].charAt(right) != '#') {
                        right--;
                    }
                    maxDif = right - left + 1;
                    maxDifAt = i;
                    mid = left - (right - left) / 2;
                    break;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                int left = 0;
                int right = m - 1;
                boolean skip = false;
                while (left < arr[i].length() && arr[i].charAt(left) != '#') {
                    left++;
                }
                if (left == arr[i].length()) {
                    skip = true;
                }
                if (!skip) {
                    while (arr[i].charAt(right) != '#') {
                        right--;
                    }
                }
                int dif = right - left + 1;
                if (dif > maxDif) {
                    maxDif = dif;
                    maxDifAt = i;
                }
            }

            System.out.println((maxDifAt + 1) + " " + (mid + 1));
        }
        sc.close();
    }
}
