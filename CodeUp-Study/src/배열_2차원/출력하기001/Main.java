package 배열_2차원.출력하기001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[20][20];
        int a = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < a; i++) {
            int[] x = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(arr[x[0]][x[1]] == 0) {
                arr[x[0]][x[1]]++;
            }
        }

        /*for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }*/
        for(int i = 1; i <= arr.length - 1; i++) {
            for(int j = 1; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
