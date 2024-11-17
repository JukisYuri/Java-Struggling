package JavaBasic.Excercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IntNum {
    public static void sortDescending(List<Integer> array){
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i) < array.get(j)){
                    Collections.swap(array, i, j);
                }
            }
        }
    }
    public static void sortAscending(List<Integer> array){
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i) > array.get(j)){
                    Collections.swap(array, j, i);
                }
            }
        }
    }
    public static void main(String[] arg){
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(4);
        array.add(7);
        array.add(3);
        array.add(8);
        sortAscending(array);
        System.out.println("Sort Ascending:" + array);
        sortDescending(array);
        System.out.println("Sort Descending:" + array);
    }
}
