package 입출력.입출력008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int hour = Integer.parseInt(input.split(":")[0]);
        int min = Integer.parseInt(input.split(":")[1]);

        System.out.println(hour + ":" + min);
    }
}
