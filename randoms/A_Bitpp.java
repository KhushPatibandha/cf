import java.util.Scanner;

public class A_Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int inputOpp = sc.nextInt();
        for(int i = 0; i < inputOpp; i++) {
            String input = sc.next();
            char c = input.charAt(1);
            if(c == '+') {
                res++;
            } else {
                res--;
            }
        }
        System.out.println(res);
        sc.close();
    }
}