package 선택실행구조.출력하기001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a % 2 == 0) {
            System.out.println(a);
        }
        if(b % 2 == 0) {
            System.out.println(b);
        }
        if(c % 2 == 0) {
            System.out.println(c);
        }
    }
}
