package dsa.collections_linkedlist;

import java.util.LinkedList;
import java.util.Collections;

public class MergeSortedLinkedLists {

    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged Sorted List: " + mergedList);
    }
}
