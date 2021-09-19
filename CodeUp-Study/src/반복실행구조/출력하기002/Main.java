package 반복실행구조.출력하기002;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int x = 0; x < a; x++) {
            System.out.println(arr[x]);
        }
    }
}
