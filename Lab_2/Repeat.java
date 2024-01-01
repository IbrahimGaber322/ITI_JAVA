import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Repeat {
    public static int countRepetitions(String input, String word) {
        if (input == null || word == null) {
            throw new IllegalArgumentException("Input string or word cannot be null");
        }

        String[] words = input.split("\\s+|,|\\.|;|:|!|\\?|\\(|\\)|\\[|\\]|\\{|\\}|\"|'");

        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        return count;
    }

    public static int countRepetitionsStream(String input, String word) {
        if (input == null || word == null) {
            throw new IllegalArgumentException("Input string or word cannot be null");
        }
   
        String[] words = input.split("\\s+|,|\\.|;|:|!|\\?|\\(|\\)|\\[|\\]|\\{|\\}|\"|'");

        int count = (int) Arrays.stream(words)
                .filter(w -> w.equals(word))
                .count();

        return count;
    }

    public static int countRepetitionsWithTokenizer(String input, String partialWord) {
        if (input == null || partialWord == null) {
            throw new IllegalArgumentException("Input string or partialWord cannot be null");
        }

        Pattern pattern = Pattern.compile(Pattern.quote(partialWord));
        StringTokenizer tokenizer = new StringTokenizer(input);
        int count = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            Matcher matcher = pattern.matcher(token);

            if (matcher.find()) {
                count++;
            }
        }

        return count;
    }
}
