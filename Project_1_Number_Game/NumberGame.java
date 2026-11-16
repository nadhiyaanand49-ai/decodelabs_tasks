
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playAgain = 1;

        System.out.println("================================");
        System.out.println("     WELCOME TO NUMBER GAME");
        System.out.println("================================");

        while (playAgain == 1) {

            int number = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("Try to guess the number!");

            while (guess != number) {

                System.out.print("\nEnter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess > number) {
                    System.out.println("Too High! Try again.");
                }
                else if (guess < number) {
                    System.out.println("Too Low! Try again.");
                }
                else {
                    System.out.println("\nCongratulations! You guessed it correctly!");
                    System.out.println("Number of attempts: " + attempts);
                }
            }

            System.out.println("\nDo you want to play again?");
            System.out.println("Enter 1 for Yes or 0 for No:");

            playAgain = sc.nextInt();
        }

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}
