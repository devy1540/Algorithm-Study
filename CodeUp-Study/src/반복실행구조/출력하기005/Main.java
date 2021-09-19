package 반복실행구조.출력하기005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        while(a != 0) {
            System.out.println(--a);
        }
    }
}
