package 비교연산.비교하기004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
