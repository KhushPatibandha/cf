import java.util.Scanner;

public class A_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int count = 0;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '4' || num.charAt(i) == '7') {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("NO");
            sc.close();
            return;
        }
        while(count > 0) {
            if(count % 10 != 4 && count % 10 != 7) {
                System.out.println("NO");
                sc.close();
                return;
            }
            count /= 10;
        }
        
        System.out.println("YES");
        sc.close();
    }
}
