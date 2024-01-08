import java.util.Scanner;

import Dictionary.WordMap;

public class main {
    public static void main(String[] args) {
        WordMap dictionary = new WordMap();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDictionary Program Menu:");
            System.out.println("1. Add Words");
            System.out.println("2. Print All Letters and Words");
            System.out.println("3. Print Words of Given Letter");
            System.out.println("4. Search Words");
            System.out.println("5. Remove Word");
            System.out.println("6. Remove All Words for a Letter");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter words (comma-separated): ");
                    String[] words = scanner.nextLine().split(",");
                    Boolean res1 = dictionary.addWords(words);
                    if (res1) {
                        System.out.println("Words added successfully!");
                    } else {
                        System.out.println("Please add alphabetical characters only split by comma");
                    }

                    break;
                case 2:
                    dictionary.printAllLettersAndWords();
                    break;
                case 3:
                    System.out.print("Enter a letter: ");
                    char letterToPrint = scanner.next().charAt(0);
                    dictionary.printWordsOfGivenLetter(letterToPrint);
                    break;
                case 4:
                    System.out.print("Enter a regex pattern: ");
                    String regexPattern = scanner.nextLine();
                    dictionary.search(regexPattern);
                    break;
                case 5:
                    System.out.print("Enter a word to remove: ");
                    String wordToRemove = scanner.nextLine();
                    Boolean res5 = dictionary.removeWord(wordToRemove);
                    if (res5) {
                        System.out.println("Word removed successfully!");
                    } else {
                        System.out.println("Word doesn't exist.");
                    }

                    break;
                case 6:
                    System.out.print("Enter a letter to remove all words: ");
                    char letterToRemove = scanner.next().charAt(0);
                    dictionary.removeKey(letterToRemove);
                    System.out.println("All words for letter " + letterToRemove + " removed successfully!");
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
