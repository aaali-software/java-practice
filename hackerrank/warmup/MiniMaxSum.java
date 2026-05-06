package hackerrank.warmup;

import java.io.IOException;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for (int value : arr) {
            total += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println((total - max) + " " + (total - min));
    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }

}
