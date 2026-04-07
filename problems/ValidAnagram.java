package problems;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
    }

    Map<Character, Integer> counts = new HashMap<>();

    for (char c : s.toCharArray()) {
        counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    for (char c : t.toCharArray()) {
        if (!counts.containsKey(c)) {
            return false;
        }

        counts.put(c, counts.get(c) - 1);

        if (counts.get(c) == 0) {
            counts.remove(c);
        }
    }

    return counts.isEmpty();

}
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car"));       // false
    }
}