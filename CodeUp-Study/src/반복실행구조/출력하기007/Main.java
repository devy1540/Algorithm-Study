package 반복실행구조.출력하기007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
}
