package 종합.출력하기014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long m = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();

        for(int i = 1; i < n; i++) {
            a = (a * m) + d;
        }
        System.out.println(a);
    }
}
