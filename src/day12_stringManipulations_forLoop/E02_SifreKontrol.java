package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class E02_SifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Sifrenizi Giriniz ");
        String sifre = scan.nextLine();

        /* */
        int flag = 20;
        int sayac = 0;

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)) {
            System.out.println("Ilk harf kücük harf olmali");
            flag =15;
            sayac ++;
        }

        //Son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);

        if (!(sonHarf >= '0' && sonHarf<= '9')) {
            System.out.println("son karakter rakam olmali");
            flag =15;
            sayac ++;
        }

        //sifre bosluk icermemeli

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag =15;
            sayac ++;
        }

        //uzunlugu en az 10 karakter olmali

        if (sifre.length()<10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag =15;
            sayac ++;
        }


        //flag ile sonuc yazdirma
        if (flag == 20) {
            System.out.println("Sifre Basarili");
        } else {
            System.out.println("Lütfen hatalari düzelterek yeniden sifre giriniz.");
        }

        if (sayac == 0) {
            System.out.println("Sifre Basarili");
        } else {
            System.out.println(sayac + " Hata var. hatalari düzelterek yeniden deneyiniz");
        }
    }
}
