package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {
    public  static  List<Integer> unionList(ArrayList<Integer> list1, ArrayList<Integer>list2){
        list1.addAll(list2);
        return list1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        Union union = new Union();
        List<Integer> result = union.unionList(list1, list2);

        System.out.println("Intersection: " + result);
    }
}
