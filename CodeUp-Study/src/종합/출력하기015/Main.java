package 종합.출력하기015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int day = 1;
        while(day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }

        System.out.println(day);
    }
}
