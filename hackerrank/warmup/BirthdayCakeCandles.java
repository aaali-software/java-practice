package hackerrank.warmup;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int maxHeight = 0;

        for (int height : candles) {
            if (height > maxHeight) {
                maxHeight = height;
                count = 1; // Reset count for new max height
            } else if (height == maxHeight) {
                count++; // Increment count for same max height
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = List.of(3, 2, 1, 3);
        int count = birthdayCakeCandles(candles);
        System.out.println(count);
    }
}
