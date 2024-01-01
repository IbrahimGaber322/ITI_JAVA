import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[1000];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 1000 + 1);
        }

        // Binary Search
        long startTimeB = System.nanoTime();
        int indexB = BinaryMinMax.binarySearch(myArray, 500);
        long endTimeB = System.nanoTime();
        long elapsedTimeB = endTimeB - startTimeB;

        System.out.println("Binary Search time : " + elapsedTimeB);

        // MinMax MAX

        long startTimeM = System.nanoTime();
        int max = MinMax.findMax(myArray);
        long endTimeM = System.nanoTime();
        long elapsedTimeM = endTimeM - startTimeM;

        System.out.println("MinMax max time : " + elapsedTimeM);

        // MinMax MIN

        long startTimem = System.nanoTime();
        int min = MinMax.findMin(myArray);
        long endTimem = System.nanoTime();
        long elapsedTimem = endTimem - startTimem;

        System.out.println("MinMax min time : " + elapsedTimem);

        // Stream MAX

        long startTimeSM = System.nanoTime();
        int SMax = Arrays.stream(myArray).max().orElse(-1);
        long endTimeSM = System.nanoTime();
        long elapsedTimeSM = endTimeSM - startTimeSM;

        System.out.println("Stream Max time : " + elapsedTimeSM);

        // Stream MIN

        long startTimeSm = System.nanoTime();
        int SMin = Arrays.stream(myArray).min().orElse(-1);
        long endTimeSm = System.nanoTime();
        long elapsedTimeSm = endTimeSm - startTimeSm;

        System.out.println("Stream Min time : " + elapsedTimeSm);

        String longString = "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape " +
                "apple banana orange apple grape apple banana orange apple grape ";

        int bananaCount = Repeat.countRepetitions(longString, "banana");

        int appleCount = Repeat.countRepetitionsWithTokenizer(longString, "app");

        int orangeCount = Repeat.countRepetitionsStream(longString, "orange");

        System.out.println("Banana count = " + bananaCount + " , Apple count = " + appleCount + " , Orange count = " + orangeCount);
    }
}