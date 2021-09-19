package 입출력.입출력013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        System.out.println(n.split("\\.")[0]);
        System.out.println(n.split("\\.")[1]);
    }
}
