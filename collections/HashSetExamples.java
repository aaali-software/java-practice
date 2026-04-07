package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

    public static void main(String[] args) {

        // Example 1: remove duplicates
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        
        Set<Integer> set = new HashSet<>();;
        for (int num : nums) {
            set.add(num);
        }

        System.out.println("Unique numbers: " + set);

        // Example 2: check for duplicates
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
            } 
            seen.add(num);
        }

        // Example 3: intersection of two arrays
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 4, 5, 6};

        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                intersection.add(n);
            }
        }

        System.out.println("Intersection: " + intersection);
    }
}