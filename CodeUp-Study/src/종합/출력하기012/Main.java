package 종합.출력하기012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 1; i < n; i++) {
            a += d;
        }

        System.out.println(a);
    }
}
