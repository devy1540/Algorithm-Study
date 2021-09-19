package 배열_2차원.출력하기003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        int h = scan.nextInt();
        int count = scan.nextInt();

        int[][] plate = new int[w][h];
        for (int i = 0; i < count; i++) {

            int l = scan.nextInt();
            int d = scan.nextInt();
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;


            for (int j = 0; j < l; j++) {
                if (d==0) {
                    if (y-1+j < 100-h) {
                        plate[x][y+j] = 1;
                    }
                } else {
                    if (x-1+j < 100-w) {
                        plate[x+j][y] = 1;
                    }
                }
            }

        }

        for (int a = 0; a < w; a++) {
            for (int b = 0; b < h; b++) {
                System.out.printf("%d ", plate[a][b]);
            }
            System.out.println();
        }

    }
}
