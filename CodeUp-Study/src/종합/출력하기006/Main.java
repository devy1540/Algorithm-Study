package 종합.출력하기006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 1; i <= a; i++) {
            if(i % 3 == 0) {
                if(i == a) {
                    System.out.print("X");
                } else {
                    System.out.print("X ");
                }
            } else {
                if(i == a) {
                    System.out.print(i);

                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
