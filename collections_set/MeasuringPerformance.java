package dsa.collections.collections_set;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MeasuringPerformance {
    public static void testSetPerformance(Set<Integer> set, String name, int n) {
        Instant start, end;

        start = Instant.now();
        for (int i = 0; i < n; i++) set.add(i);
        end = Instant.now();
        System.out.println(name + " add: " + Duration.between(start, end).toMillis() + " ms");

        start = Instant.now();
        set.contains(n/2);
        end = Instant.now();
        System.out.println(name + " contains: " + Duration.between(start, end).toMillis() + " ms");

        start = Instant.now();
        set.remove(n/2);
        end = Instant.now();
        System.out.println(name + " remove: " + Duration.between(start, end).toMillis() + " ms");

    }
    public static void main(String[] args) {
        testSetPerformance(new HashSet<>(), "HashSet", 1000000);
        testSetPerformance(new LinkedHashSet<>(), "LinkedHashSet", 1000000);
        testSetPerformance(new TreeSet<>(), "TreeSet", 1000000);
    }
}
