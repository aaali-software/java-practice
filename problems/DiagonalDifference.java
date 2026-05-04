package problems;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = arr.size();
        
        for (int i = 0; i < n; i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(n - 1 - i);
        }
        
        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr1 = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );
        System.out.println(diagonalDifference(arr1)); // Output: 15

        List<List<Integer>> arr2 = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(9, 8, 9)
        );
        System.out.println(diagonalDifference(arr2)); // Output: 2
    }


}
