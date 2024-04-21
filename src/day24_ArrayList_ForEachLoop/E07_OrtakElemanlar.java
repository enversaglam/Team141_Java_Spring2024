package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class E07_OrtakElemanlar {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri
        //        ayri bir liste olarak veren bir program yazin.

        int[] array1 = {3,6,8,1,0,3,8,1,1};
        int[] array2 = {3,6,7,5,6,5,6,5,1};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (int each1 : array1) {
            for (int each2 : array2) {
                if(each1 == each2 && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each2);
                }
            }
        }
        System.out.println("Ortak elemanlar listesi : "+ortakElemanlarListesi);

        // ikisinde ortak olmayan elementleri tekrar etmeden
        // ayri bir liste olarak veren bir program yazin.
        //output : [7,8,0,5]

        // ortak olmayan elemanlar icin bir list olusturalim
        List<Integer> ortakOlmayanElemanlar = new ArrayList<>();

        for (int each : array1) {
            if(!ortakElemanlarListesi.contains(each) && !ortakOlmayanElemanlar.contains(each)){
                ortakOlmayanElemanlar.add(each);
            }
        }
        for (int each : array2) {
            if(!ortakElemanlarListesi.contains(each) && !ortakOlmayanElemanlar.contains(each)){
                ortakOlmayanElemanlar.add(each);
            }
        }
        System.out.println("Ortak olmayan elemanlar listesi : "+ortakOlmayanElemanlar);
    }
}
