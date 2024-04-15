package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E01_ListMethodlari {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);
        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8));
        System.out.println(list);
        sayilar.add(1, 5);
        System.out.println(sayilar);
        sayilar.addAll(list);
        System.out.println(sayilar);
        sayilar.addAll(2, list);
        System.out.println(sayilar);
        System.out.println(sayilar.get(6));
    }
}
