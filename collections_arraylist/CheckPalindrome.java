package dsa.collections.collections_arraylist;

import java.util.ArrayList;

public class CheckPalindrome<T> {
    public  static <T>   boolean isPalindrom(ArrayList<T> list){
        if(list.size()<=1)
            return true;
        int left=0,right=list.size()-1;
        while(left<right){
            if(list.get(left)!=list.get(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(isPalindrom(list));
    }
}
