package dsa.collections.collections_arraylist;

import java.util.ArrayList;

public class LargestSmallest {
    public static void  largestSmallest(ArrayList<Integer>list){
        int smallest=Integer.MAX_VALUE,biggest=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<smallest){
                smallest=list.get(i);
            }
            if(list.get(i)>biggest){
                biggest=list.get(i);
            }
        }
        System.out.println("smallest:"+smallest);
        System.out.println("Biggest:"+biggest);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);
        System.out.println(list);
        largestSmallest(list);
    }
}
