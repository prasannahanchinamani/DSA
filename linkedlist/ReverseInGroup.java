package dsa.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseInGroup {
    public static List<Integer> kreverse(List<Integer>list,int k){
        for(int i=0;i<list.size();i+=k){
            int end=Math.min(i+k,list.size());
            Collections.reverse(list.subList(i,end));
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Original List: " + list);
        int k=3;
        List<Integer> output =kreverse(list,k);
        System.out.println("reversed:"+output);

    }
}
