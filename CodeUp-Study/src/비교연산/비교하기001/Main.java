package 비교연산.비교하기001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(Integer.compare(a, b) == -1) {
            System.out.println(0);
        } else {
            System.out.println(Integer.compare(a, b));
        }
    }
}
