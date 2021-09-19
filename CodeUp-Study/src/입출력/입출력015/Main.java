package 입출력.입출력015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int divider = (int) Math.pow(10, String.valueOf(input).length() - 1);
        while(true) {

            int result = input / divider;
            System.out.println("[" + result * divider + "]");
            if(divider == 1) {
                break;
            } else {
                input = input - result * divider;
                divider = divider / 10;
            }
        }
    }
}
