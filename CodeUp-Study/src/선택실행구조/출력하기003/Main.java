package 선택실행구조.출력하기003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if(a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
