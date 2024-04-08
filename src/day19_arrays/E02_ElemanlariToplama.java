package day19_arrays;

import java.util.Arrays;

public class E02_ElemanlariToplama {
    public static void main(String[] args) {

        int[] sayilar = {3, 4, 5, 6};
        elementToplamiYazdir(sayilar);

        int[] yeniArr = {3, 2,5 , 6,8};
        sayilar = yeniArr;
        elementToplamiYazdir(sayilar);
    }

    public static void elementToplamiYazdir(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("Verilen array deki elementlerin toplami : "+ toplam +" - yeni hali"+Arrays.toString(arr));
    }
}
