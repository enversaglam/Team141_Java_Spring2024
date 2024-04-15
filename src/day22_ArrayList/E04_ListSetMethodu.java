package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E04_ListSetMethodu {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,7,1));
        System.out.println(sayilar);
        sayilar.add(2,9);
        System.out.println(sayilar);
        //set() ==> update yani yeni deger atamasi yapar.
        sayilar.set(2, 5);
        System.out.println(sayilar);
    }
}
