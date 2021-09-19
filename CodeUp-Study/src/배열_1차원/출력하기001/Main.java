package 배열_1차원.출력하기001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        String[] sArr = s.split(" ");
        int[] arr = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[24];

        for(int i = 0; i < a; i++) {
            result[arr[i]]++;
        }

        for(int i = 1; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
