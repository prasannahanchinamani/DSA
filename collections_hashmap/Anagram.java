package dsa.collections.collections_hashmap;

import java.util.*;

public class Anagram {
    public static void anagaram(String words[]) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char character[] = word.toCharArray();
            Arrays.sort(character);
            String key=new String(character);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
//        for (List<String> group : map.values()) {
            System.out.println(map.values());
//        }
    }

    public static void main(String[] args) {
        String[] words = {"bat", "tab", "cat", "act", "tac", "dog"};
        anagaram(words);
    }
}
