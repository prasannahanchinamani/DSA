package dsa.collections.collections_arraylist;

import java.util.ArrayList;

public class Sort {
    public static void sort(ArrayList<Integer>arrayList){
        for(int i=0;i<arrayList.size();i++){
            for(int j=0;j<arrayList.size()-1-i;j++){
                if(arrayList.get(j)>arrayList.get(j+1)){
                    int temp=arrayList.get(j);
                   arrayList.set(j,arrayList.get(j+1));
                   arrayList.set(j+1,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
}
