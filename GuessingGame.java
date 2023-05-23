/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessinggame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zikhona.nombangwana
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        Random random = new Random();
        
        // Initialize the ArrayList with 10 string values
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("durian");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("honeydew");
        words.add("jackfruit");
        words.add("kiwi");
    String playAgain;
        do {
            playGame(words, random, scanner);

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));
    }

    public static void playGame(ArrayList<String> words, Random random, Scanner scanner) {
        // Randomly select a value from the array
        int randomIndex = random.nextInt(words.size());
        String selectedWord = words.get(randomIndex);

        int chances = 3;
        String guess;
        boolean guessedCorrectly = false;

        System.out.println("Guess the word!");

        while (chances > 0) {
            System.out.print("Enter your guess (" + chances + " chances remaining): ");
            guess = scanner.nextLine();

            if (guess.equalsIgnoreCase(selectedWord)) {
                guessedCorrectly = true;
                break;
            } else {
                chances--;

                if (chances == 2) {
                    // Provide a clue after the first incorrect guess
                    System.out.println("Incorrect guess! Here's a clue: The word starts with the letter '" +
                            selectedWord.charAt(0) + "'");
                } else if (chances == 1) {
                    // Provide another clue after the second incorrect guess
                    System.out.println("Incorrect guess! Here's another clue: The word has " +
                            selectedWord.length() + " letters");
                }
            }
        }

        if (guessedCorrectly) {
            // Remove the word from the list if guessed correctly
            words.remove(randomIndex);
            System.out.println("Congratulations! You guessed the word correctly.");
        } else {
            System.out.println("Out of chances! The correct word was: " + selectedWord);
        }

        System.out.println("Remaining items in the list: " + words.size());
        System.out.println();
    }
}
