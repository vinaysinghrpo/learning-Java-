package javapractice;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random random = new Random();
        String play = "yes";
        while (play.equals("yes")) {
            System.out.println("===== NUMBER GUESSING GAME =====\r\n" + //
                    "\r\n" + //
                    "1. Easy\r\n" + //
                    "2. Medium\r\n" + //
                    "3. Hard\r\n" + //
                    "\r\n" + //
                    "Choose difficulty:");
            int ch = 0, limt = 0, attempts = 0, point = 0, score = 0, high = 0;
            ch = Sc.nextInt();
            switch (ch) {
                case 1:
                    limt = 50;
                    attempts = 10;
                    point = 100;
                    break;
                case 2:
                    limt = 100;
                    attempts = 8;
                    point = 200;
                    break;
                case 3:
                    limt = 300;
                    attempts = 5;
                    point = 300;
                    break;
                default:
                    System.out.println("invalid chosse");
                    return;
            }
            int num = random.nextInt(limt) + 1;
            System.out.println("random:" + num);
            System.out.println();
            System.out.println("guess a number between 1 and " + limt + " in attemts: " + attempts);
            int guess = 00;
            while (guess != num && attempts != 0) {
                guess = Sc.nextInt();
                if (num < guess) {
                    System.out.println("your guess is high!\n" + //
                            "your guess is:" + guess);
                    --attempts;
                    System.out.println("Attempts:" + attempts);
                } else if (num > guess) {
                    System.out.println("your guess is low!\n" + //
                            "your guess is:" + guess);
                    --attempts;
                    System.out.println("Attempts:" + attempts);
                }
            }
            if (num == guess) {
                score = score + point + 10 * attempts;
                System.out.println("you are correct ");
                System.out.println("your attemts left: " + attempts);
                System.out.println("you score: " + score);
                System.out.print("high score" + high);
            } else {
                System.out.println("you are wrong correct guess is :" + num);
                System.out.println("current score 0");
                if (high > score)
                    high = score;
                System.out.print("high score" + high);
                score = 0;
            }
            System.out.println("Play again? yes/no");
            Sc.nextLine();
            play = Sc.nextLine();
        }
        System.out.println("Thanks for playing!");
    }
}