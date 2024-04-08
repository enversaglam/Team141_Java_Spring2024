package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class E02_UzunlukKontrol {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan bir String alin,
        //         String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //         String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();
        
        if (metin.length()%2 == 0){
            // Eghbal  uzunluk==>6   ilk yarisi + :) + ikinci yarisi
            System.out.println(
                            metin.substring(0, metin.length()/2) +
                            ":)"+
                            metin.substring(metin.length()/2)
            );
        } else {
            // Seren   uzunluk==>5  substring 5/2 + :( + 5/2 +1
            System.out.println(
                            metin.substring(0, metin.length()/2)+
                            ":(" +
                            metin.substring(metin.length()/2+1)
            );
        }
    }
}
