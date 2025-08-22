package dsa.collections_list;

import java.util.LinkedList;

public class RemoveNthNode {
    public static <T> void removeNthFromEnd(LinkedList<T> list, int n) {
        int indexToRemove = list.size() - n;
        if (indexToRemove >= 0 && indexToRemove < list.size()) {
            list.remove(indexToRemove);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        removeNthFromEnd(list, 2);
        System.out.println(list);  // Output: [10, 20, 40]
    }
}
