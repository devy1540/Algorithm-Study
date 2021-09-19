package 배열_1차원.출력하기002;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
