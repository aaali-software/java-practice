package hackerrank;

public class CalculateArrayRatios {

    public static void main(String[] args) {
        int[] arr = { -4, 3, -9, 0, 4, 1 };
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        int totalElements = arr.length;
        System.out.printf("%.6f%n", (double) positiveCount / totalElements);
        System.out.printf("%.6f%n", (double) negativeCount / totalElements);
        System.out.printf("%.6f%n", (double) zeroCount / totalElements);
    }

}
