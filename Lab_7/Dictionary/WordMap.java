package Dictionary;

import java.util.*;
import java.util.regex.Pattern;

public class WordMap {
    private Map<Character, TreeSet<String>> wordsMap;

    public WordMap() {
        wordsMap = new TreeMap<>();
    }

    public Boolean addWords(String[] words) {
        Boolean res = false;
        for (String word : words) {

            String trimmedWord = word.trim();

            if (trimmedWord.matches("[a-zA-Z]+")) {
                char firstLetter = Character.toUpperCase(trimmedWord.charAt(0));
                wordsMap.computeIfAbsent(firstLetter, k -> new TreeSet<String>()).add(trimmedWord);
                res = true;
            }
        }
        // Use sorted list
        // Sort the words for each alphabet

        return res;
    }

    public void printAllLettersAndWords() {
        for (Map.Entry<Character, TreeSet<String>> entry : wordsMap.entrySet()) {
            char letter = entry.getKey();
            TreeSet<String> words = entry.getValue();
            System.out.println(letter + ": " + String.join(", ", words));
        }
    }

    public void printWordsOfGivenLetter(char letter) {
        TreeSet<String> words = wordsMap.get(Character.toUpperCase(letter));
        if (words != null) {
            System.out.println(letter + ": " + String.join(", ", words));
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }
    public void search(String regexPattern) {
        for (Map.Entry<Character, TreeSet<String>> entry : wordsMap.entrySet()) {
            char letter = entry.getKey();
            TreeSet<String> words = entry.getValue();
            Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);
            ArrayList<String> matchingWords = new ArrayList<>();
            for (String word : words) {
                if (pattern.matcher(word).find()) {
                    matchingWords.add(word);
                }
            }

            if (!matchingWords.isEmpty()) {
                System.out.println(letter + ": " + String.join(", ", matchingWords));
            }
        }
    }

    public void removeKey(char key) {
        char firstLetter = Character.toUpperCase(key);
        wordsMap.remove(firstLetter);
    }

    public Boolean removeWord(String word) {
        Boolean res = false;
        char firstLetter = Character.toUpperCase(word.charAt(0));
        TreeSet<String> words = wordsMap.get(firstLetter);
        if (words != null) {
            words.remove(word);
            res = true;
            if (words.isEmpty()) {
                wordsMap.remove(firstLetter);
            }
        }
        return res;
    }
}
