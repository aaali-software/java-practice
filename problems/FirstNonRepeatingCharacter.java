package problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public char firstNonRepeatingChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '_'; // or throw exception
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter finder = new FirstNonRepeatingCharacter();
        System.out.println(finder.firstNonRepeatingChar("leetcode")); // 'l'
        System.out.println(finder.firstNonRepeatingChar("loveleetcode")); // 'v'
        System.out.println(finder.firstNonRepeatingChar("aabbcc")); // '_'
    }
}
