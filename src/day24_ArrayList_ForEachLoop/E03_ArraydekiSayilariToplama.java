package day24_ArrayList_ForEachLoop;

public class E03_ArraydekiSayilariToplama {
    
    public static void main(String[] args) {
        // verine int bir arraydeki
        // tum tek sayilari toplayip, yazdirin
        int[] sayilar = {3,5,6,7,3,1,2,6,5,4};

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]%2 != 0 ){
                toplam += sayilar[i];
            }
        }
        System.out.println("Array deki tek sayilarin toplami : "+ toplam);

        toplam = 0;

        for (int each : sayilar) {
            if(each % 2 != 0 ){
                toplam += each;
            }
        }
        System.out.println("Array deki tek sayilarin toplami each ile : "+ toplam);
    }
}
