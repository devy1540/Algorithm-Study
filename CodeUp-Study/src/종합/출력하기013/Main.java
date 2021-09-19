package 종합.출력하기013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long r = scanner.nextLong();
        long n = scanner.nextLong();

        for(int i = 1; i < n; i++) {
            a *= r;
        }
        System.out.println(a);
    }
}
