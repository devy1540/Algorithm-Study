package 종합.출력하기005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int a = Integer.valueOf(s, 16);

        for(int i = 1; i <= 15; i++) {
            System.out.println(s.toUpperCase() + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(a * i).toUpperCase());
        }
    }
}
