/*
A number-guessing game.

Requirements:
-The computer will choose a random number between 1-100 and ask the user to guess it.
-Once the user guesses, the computer will tell the user if their guess was too high or too low.
-The game ends once the user has guessed the number correctly, then the computer will print the total number of guesses the user made before getting the right answer.
-Will need to add error handling for bad player input.

*/
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello! What's your name?"); // ask player name
    String playerName = scanner.next();
    System.out.println("Greetings " + playerName + "! Let's play a number guessing game."); // greet player

    System.out.println("I'm thinking of a number between 1 and 100.");
    int myNumber = (int)(Math.random() * 100 + 1); // computer chooses random number
    int numTries = 0;

    System.out.println("Let's see if you can guess my number.");

    while (true) {
      System.out.println("What's your guess? ");
      int playerGuess = scanner.nextInt(); // playerGuess changes each loop

      if (playerGuess > 100 || playerGuess < 1) {
        System.out.println("We won't count that guess... Remember, only numbers 1-100, try again.");
        continue;
      }

      if (myNumber < playerGuess) {
        System.out.println("Your guess is too high, try again.");
        numTries++;
      }
      else if (myNumber > playerGuess) {
        System.out.println("Your guess is too low, try again.");
        numTries++;
      }
      else {
        numTries++; // if not > or <, numbers are equal
        break;
      }
    }
    System.out.println("Nice, " + playerName + "! You guessed my number in " + numTries + " tries!");
  }
}
