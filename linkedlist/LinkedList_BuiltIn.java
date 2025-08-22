package linkedlist;

import java.util.LinkedList;

public class LinkedList_BuiltIn {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.addFirst(1);
//        System.out.println(list.peek());
//        list.removeLast();
        System.out.println(list);//[3 2 1,add(1)]

    }
}
