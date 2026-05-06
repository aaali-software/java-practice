package hackerrank.warmup;

public class Staircase {

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "#".repeat(i));
        }
    }

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }

}
