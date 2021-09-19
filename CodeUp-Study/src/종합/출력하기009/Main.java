package 종합.출력하기009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long w = scanner.nextLong();
        long h = scanner.nextLong();
        long b = scanner.nextLong();

        double result = w * h * b / 8.0 / 1024.0 / 1024.0;

        System.out.printf("%.2f MB", result);
    }
}
