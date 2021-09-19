package 선택실행구조.출력하기004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a >= 90) {
            System.out.println("A");
        } else if(a >= 70) {
            System.out.println("B");
        } else if(a >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
