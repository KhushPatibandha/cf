import java.util.Scanner;

public class A_WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int times = sc.nextInt();
        for(int i = 0; i < times; i++) {
            if(num % 10 > 0) {
                num--;
            } else if(num % 10 == 0) {
                num /= 10;
            }
        }
        System.out.println(num);
        sc.close();
    }
}