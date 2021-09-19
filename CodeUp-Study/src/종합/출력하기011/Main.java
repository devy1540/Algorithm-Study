package 종합.출력하기011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 1; i <= a; i++) {
            if(i % 3 != 0) {
                if(i == a) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
