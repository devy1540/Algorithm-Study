package 종합.출력하기003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = 0;
        int result = 0;

        do{
            x++;
            result += x;
        }while(result < a);
        System.out.println(x);
    }
}
