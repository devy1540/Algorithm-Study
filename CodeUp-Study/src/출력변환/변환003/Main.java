package 출력변환.변환003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.toHexString(scanner.nextInt()).toUpperCase());
    }
}
