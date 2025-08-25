package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public  static  void reverse(ArrayList<Integer>arrayList){
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=arrayList.size()-1;i>=0;i--){
            result.add(arrayList.get(i));
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(list1);
        reverse(list1);
    }
}
