package dsa.collections.collections_set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueStrings {
    public static LinkedHashSet<String> removeduplocates(List<String> list) {
        return new LinkedHashSet<>(list);//removing in order only
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(input);
        LinkedHashSet<String>output=removeduplocates(input);
        System.out.println(output);
    }
}
