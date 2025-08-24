package dsa.collections.collections_set;

import java.util.*;

public class AllTypessSet_Behaviour {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>(Arrays.asList(5, 3, 5, 1, 2));
        System.out.println(list);
//Hashset Unique
        Set<Integer> hashSetset=new HashSet<>(list);
        System.out.println(hashSetset);
//LinkedHashset insertion with uniquq elemets
        Set<Integer>linkedhashset=new LinkedHashSet<>(list);
        System.out.println(linkedhashset);
//sorted order we get
        Set<Integer>treeset=new TreeSet<>(list);
        System.out.println(treeset);
    }
}
