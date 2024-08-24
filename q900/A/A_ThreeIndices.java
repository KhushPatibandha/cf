package q900.A;

import java.util.HashMap;
import java.util.Scanner;

public class A_ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], i);
            }

            int[] prefixMin = new int[n];
            int[] suffixMin = new int[n];

            int pMin = Integer.MAX_VALUE;
            int sMin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] < pMin) {
                    pMin = arr[i];
                }
                prefixMin[i] = pMin;
            }

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < sMin) {
                    sMin = arr[i];
                }
                suffixMin[i] = sMin;
            }

            boolean gotAns = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] > prefixMin[i] && arr[i] > suffixMin[i]) {
                    System.out.println("YES");
                    System.out.println(
                            (map.get(prefixMin[i]) + 1)
                                    + " "
                                    + (map.get(arr[i]) + 1)
                                    + " "
                                    + (map.get(suffixMin[i]) + 1));
                    gotAns = true;
                    break;
                }
            }

            if (!gotAns) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

// 4 6 1 2 5 3
// 4 4 1 1 1 1
// 1 1 1 2 3 3
