package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }

        // Step 2: min heap based on frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b)
        );

        for (int num : freqMap.keySet()) {
            heap.add(num);

            if (heap.size() > k) {
                heap.poll(); // remove smallest frequency
            }
        }

        // Step 3: build result
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }
}