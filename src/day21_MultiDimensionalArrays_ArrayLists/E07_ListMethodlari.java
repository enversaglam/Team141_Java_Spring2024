package day21_MultiDimensionalArrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E07_ListMethodlari {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(2);
        sayilar.add(3);
        System.out.println(sayilar);
        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(7));
    }
}
