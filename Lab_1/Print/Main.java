package Print;
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RepeatString <string> <number>");
            return;
        }

        // Extract the string and number from command-line arguments
        String inputString = args[0];
        int repeatCount;

        // Handle NumberFormatException in case the second argument is not a valid number
        try {
            repeatCount = Integer.parseInt(args[1]);

            // Check if the number is negative
            if (repeatCount < 0) {
                System.out.println("Error: Second argument must be a non-negative number.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Second argument must be a valid integer.");
            return;
        }

        // Print the string the specified number of times
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(inputString + " " + (i + 1));
        }
    }
}
