package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class E06_DoWhileLoop {
    public static void main(String[] args) {
        
        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        //         o harfleri ve aralarindaki harfleri yazdirin.
        //         kullanici bir harf harf degil
        //         bir metin girerse uyari verip, yeniden harf girmesini isteyin
        //         kullanici harf girinceye kadar tekrar isteyin

        Scanner scanner = new Scanner(System.in);

        String baslangicStr;
        String bitisStr;
        char baslangic = 'a';
        char bitis = 'a';

        do {

            System.out.println("Lütfen baslangis harfini giriniz..");
            baslangicStr = scanner.nextLine();

            if (baslangicStr.length() == 1) {

                baslangic = baslangicStr.charAt(0);

            } else {

                System.out.println("Sadece 1 harf girmelisiniz.");
            }

        } while (baslangicStr.length() != 1);

        do {

            System.out.println("Lütfen bitis harfini giriniz..");
            bitisStr = scanner.nextLine();

            if (bitisStr.length() == 1) {

                bitis = bitisStr.charAt(0);

            } else {

                System.out.println("Sadece 1 harf girmelisiniz.");
            }

        } while (bitisStr.length() != 1);
        

        do {
            System.out.print(baslangic+ " ");
            baslangic++;

        } while (baslangic <= bitis);
    }
}
