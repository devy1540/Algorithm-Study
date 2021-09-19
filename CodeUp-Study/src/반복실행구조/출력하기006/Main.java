package 반복실행구조.출력하기006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);

        for(int i = 97; i <= (int) c; i++) {
            if(i == (int) c) {
                System.out.print((char) i);
            } else {
                System.out.print((char) i + " ");
            }
        }
    }
}
