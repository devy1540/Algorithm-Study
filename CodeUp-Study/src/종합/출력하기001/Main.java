package 종합.출력하기001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int result = 0;
        for(int i = 0; i <= a; i++) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
