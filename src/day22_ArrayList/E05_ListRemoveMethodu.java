package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E05_ListRemoveMethodu {
    public static void main(String[] args) {
        List<String > harfler = new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));

        // remove(istenenObject) ==> listede varsa siler ve liste degisir
        //                           listede yoksa silemez, liste de degismez
        System.out.println(harfler); // [a, r, a, t, a, s]

        harfler.remove("a");

        System.out.println(harfler); // [r, a, t, a, s]

        harfler.remove("x");

        System.out.println(harfler); // [r, a, t, a, s]
        System.out.println(harfler.remove("s")); //true
        System.out.println(harfler);
        System.out.println(harfler.remove(1));
        System.out.println(harfler);
        List<String> karakterler = new ArrayList<>(Arrays.asList("9","a","%","i","#"));
        System.out.println(karakterler);
        System.out.println(karakterler.removeAll(harfler));
        System.out.println(karakterler);
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,3,5,6));
        System.out.println(sayilar);
        sayilar.remove(2);
        System.out.println(sayilar);
        Integer silinecekSayi = 6;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);
        sayilar.clear();
        System.out.println(sayilar);
    }
}
