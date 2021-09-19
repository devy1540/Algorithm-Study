package 데이터형.출력001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String i = scanner.nextLine();
        long x = Integer.parseUnsignedInt(i) & 0xFFFFFFFFL;


        System.out.println(x);
    }
}
