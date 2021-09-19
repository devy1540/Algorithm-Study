package 배열_1차원.출력하기003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int x = 23;

        for(int i : arr) {
            if(x > i) {
                x = i;
            }
        }

        System.out.println(x);
    }
}
