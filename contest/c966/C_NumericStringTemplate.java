package contest.c966;

import java.util.HashMap;
import java.util.Scanner;

public class C_NumericStringTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            String[] strs = new String[m];
            for(int i = 0; i < m; i++) {
                strs[i] = sc.next();
            }

            for(int i = 0; i < strs.length; i++) {
                HashMap<Character, Integer> map = new HashMap<>();
                if(strs[i].length() != arr.length) {
                    System.out.println("NO");
                    continue;
                }
                boolean gotAns = false;
                for(int k = 0; k < strs[i].length(); k++) {
                    char c = strs[i].charAt(k);
                    if(!map.containsKey(c)) {
                        if(!map.containsValue(arr[k])) {
                            map.put(c, arr[k]);
                        } else {
                            System.out.println("NO");
                            gotAns = true;
                            break;
                        }
                    }
                    if(map.containsKey(c)) {
                        if(map.get(c) != arr[k]) {
                            System.out.println("NO");
                            gotAns = true;
                            break;
                        }
                    }
                }
                if(!gotAns) {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}

// 1 2 3 1 1
// abcad

// a -> 1
// b -> 2
// c -> 3
// d -> 1