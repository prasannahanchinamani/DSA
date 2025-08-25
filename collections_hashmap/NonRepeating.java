package dsa.collections.collections_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
    public static void nonRepeating(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "swiss";
        nonRepeating(str);
    }
}
