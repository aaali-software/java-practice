package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

public class arrays_ds {
    public static List<Integer> reverseArray(List<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n / 2; i++) {  // Swap elements at index i and n - 1 - i
            int temp = a.get(i);  // Store the current element at index i
            a.set(i, a.get(n - 1 - i));  // Set the element at index i to the element at index n - 1 - i
            a.set(n - 1 - i, temp);  // Set the element at index n - 1 - i to the stored element (originally at index i)
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(reverseArray(a)); // Output: [5, 4, 3, 2, 1]
    }

}
