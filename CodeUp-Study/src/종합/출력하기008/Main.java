package 종합.출력하기008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long h = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();

        double result = h * b * c * s / 8.0 / 1024.0 / 1024.0;

        System.out.printf("%.1f MB", result);
    }
}
