package 반복실행구조.출력하기001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int x : a) {
            if(x != 0) {
                System.out.println(x);
            } else {
                break;
            }
        }
    }
}
