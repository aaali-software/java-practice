package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorExamples {

    public static void main(String[] args) {

        // Example 1: Sort integers ascending
        List<Integer> nums = Arrays.asList(5, 2, 8, 1);

        nums.sort((a, b) -> a - b);
        System.out.println("Ascending: " + nums);

        // Example 2: Sort integers descending
        nums.sort((a, b) -> b - a);
        System.out.println("Descending: " + nums);

        // Example 3: Sort strings by length, then lexicographically
        List<String> words = Arrays.asList("apple", "bat", "banana", "cat");

        words.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length(); // sort by length, shorter first
            } else {
                return a.compareTo(b); // lexicographical order if lengths are equal
            }
        });

        System.out.println("Sorted words: " + words);

        // Example 4: Sort custom objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Aziz", 31));
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 29));

        // Sort by age, then name
        people.sort((a, b) -> {
            if (a.age != b.age) {
                return a.age - b.age; // sort by age, younger first
            } 
            return a.name.compareTo(b.name); // sort by name if ages are equal
            
        });

        System.out.println("Sorted people:");
        for (Person p : people) {
            System.out.println(p.name + " - " + p.age);
        }
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}