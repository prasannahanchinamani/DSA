package dsa.collections.collections_hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortBased {
    public static void sortBasedOnkey() {
//        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 3);
        ArrayList<String> sortedkey = new ArrayList<>(map.keySet());
        Collections.sort(sortedkey);
        System.out.println("Sorted by Keys:");
        for (String key : sortedkey)
            System.out.println(key + " " + map.get(key));

    }

    public static void sortBasedOnValues() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 3);//new ArrayList<>(map.entrySet());
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        sortBasedOnkey();
        System.out.println();
        sortBasedOnValues();
//        sortBasedOnValues();
    }
}
