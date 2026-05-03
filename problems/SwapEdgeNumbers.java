package problems;

public class SwapEdgeNumbers {

    public String swapEdgeNumbers(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);

                result.append(last).append(middle).append(first);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        SwapEdgeNumbers swapper = new SwapEdgeNumbers();
        System.out.println(swapper.swapEdgeNumbers("hello world")); // "oellh dlorw"
        System.out.println(swapper.swapEdgeNumbers("a b c"));       // "a b c"
        System.out.println(swapper.swapEdgeNumbers("swap edges"));  // "paws sdege"
    }

}
