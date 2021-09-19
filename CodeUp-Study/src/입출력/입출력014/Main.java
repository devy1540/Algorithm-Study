package 입출력.입출력014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        for(String s1 : s.split("")) {
            System.out.println("'" + s1 + "'");
        }
    }
}
