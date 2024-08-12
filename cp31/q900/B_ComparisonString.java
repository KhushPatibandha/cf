package cp31.q900;

import java.util.Scanner;

public class B_ComparisonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            int n = sc.nextInt();
            String str = sc.next();

            int count = 1;
            int maxCount = 0;
            for(int i = 0; i < n - 1; i++) {
                if(str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    if(maxCount < count) {
                        maxCount = count;
                    }
                    count = 1;
                }
            }
            if(maxCount < count) {
                maxCount = count;
            }
            System.out.println(maxCount + 1);
        }
        sc.close();
    }
}
