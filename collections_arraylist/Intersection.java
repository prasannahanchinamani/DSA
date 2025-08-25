package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public List<Integer> intersectionList(ArrayList<Integer>list1, ArrayList<Integer>list2){
        list1.retainAll(list2);
        return list1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        Intersection inter = new Intersection();
        List<Integer> result = inter.intersectionList(list1, list2);

        System.out.println("Intersection: " + result);
    }
}
