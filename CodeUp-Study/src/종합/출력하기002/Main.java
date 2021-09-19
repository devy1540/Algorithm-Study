package 종합.출력하기002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] stringArr = s.split(" ");

        for(String s1 : stringArr) {
            System.out.println(s1);
            if(s1.equalsIgnoreCase("q")) {
                break;
            }
        }
    }
}
