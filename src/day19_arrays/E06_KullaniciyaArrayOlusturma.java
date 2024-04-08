package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        //         ve bize donduren bir method olusturun.

        // System.out.println(Arrays.toString(arrayOlustur()));

        int[] kullaniciArr = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArr));
        
        for (int i = 0; i < kullaniciArr.length; i++) {
            kullaniciArr[i]++;
        }
        
        System.out.println(Arrays.toString(kullaniciArr));
        
    }

    public static int[] arrayOlustur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen array in kac elemanli olacagini giriniz...");
        int length = scanner.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" . indexteki eleman icin bir deger giriniz...");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
