package 배열_2차원.출력하기002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int c = scanner.nextInt();

        for(int n = 0; n < c; n++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            //[10, i]가 0이면 1로, 1이면 0으로
            for(int i = 0; i < arr.length; i++) {
                if(arr[x][i] == 0) {
                    arr[x][i] = 1;
                } else {
                    arr[x][i] = 0;
                }
            }

            for(int j = 0; j < arr.length; j++) {
                if(arr[j][y] == 0) {
                    arr[j][y] = 1;
                } else {
                    arr[j][y] = 0;
                }
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }
}
