package 입출력.입출력016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%d", Integer.parseInt(scanner.nextLine().split(":")[1]));
    }
}
