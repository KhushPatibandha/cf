package q800.A;

import java.util.HashMap;
import java.util.Scanner;

public class A_DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            if(map.size() > 2) {
                System.out.println("NO");
                continue;
            } else {
                int[] keys = new int[2];
                int[] values = new int[2];
                int k = 0;
                for(int key : map.keySet()) {
                    keys[k] = key;
                    values[k] = map.get(key);
                    k++;
                }
                if(keys[1] == 0) {
                    System.out.println("YES");
                    continue;
                } else if((values[0] == values[1]) || (values[0] - 1 == values[1]) || (values[0] == values[1] - 1)) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            }
        }
        sc.close();
    }
}
