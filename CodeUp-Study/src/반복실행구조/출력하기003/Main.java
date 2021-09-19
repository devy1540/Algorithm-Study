package 반복실행구조.출력하기003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                System.out.println(a[i]);
            } else {
                break;
            }
        }
    }
}
