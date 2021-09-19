package chapter3.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int cnt = 0;
        //동전
        int[] coins = {500, 100, 50, 10};

        for (int coin : coins) {
            cnt += money / coin;
            money %= coin;
        }

        System.out.println(cnt);
    }
}
