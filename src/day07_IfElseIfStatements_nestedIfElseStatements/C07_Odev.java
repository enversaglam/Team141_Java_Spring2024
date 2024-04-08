package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        
        /*
            if-else ile yazdigimiz kodlarda
            karar vermek icin degerlendirdigimiz degiskenler birden fazla ise
            daha anlasilir bir kod yazmak istersek

            - once degiskenlerden birini ana degisken kabul edip
              o degiskene gore, if, else if, else... yapisi olusturun


         */

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E:Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        // ana degiskenimiz cinsiyet olsun

        if (yas<20 || yas>80){ // hatali yas

            System.out.println("Hatali yas");

        } else if (yas >= 65) { // kadinlar ve erkekler

            if (cinsiyet == 'E') System.out.println("Erkek emekli olabilir");
            else if (cinsiyet == 'K') System.out.println("Kadin emekli olabilir");
            else System.out.println("Cinsiyet icin K veya E girmelisiniz");

        } else if (yas >= 60) { // kadinlar

            if (cinsiyet == 'E') System.out.println("Emekli olmak icin daha " + (65-yas) + " yil calismalisin");
            else if (cinsiyet == 'K') System.out.println("Kadin emekli olabilir");
            else System.out.println("Cinsiyet icin K veya E girmelisiniz");

        } else if (yas >= 20) { // hic kimse emekli olamaz

            if (cinsiyet == 'E') System.out.println("Emekli olmak icin daha " + (65-yas) + " yil calismalisin");
            else if (cinsiyet == 'K') System.out.println("Emekli olmak icin daha " + (60-yas) + " yil calismalisin");
            else System.out.println("Cinsiyet icin K veya E girmelisiniz");

        } else {
            System.out.println("Gecerli bir yas girmelisiniz");
        }
    }
}
