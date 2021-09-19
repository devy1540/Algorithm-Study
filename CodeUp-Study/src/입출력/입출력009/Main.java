package 입출력.입출력009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int year = Integer.parseInt(input.split("\\.")[0]);
        int month = Integer.parseInt(input.split("\\.")[1]);
        int day = Integer.parseInt(input.split("\\.")[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
