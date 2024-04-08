package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class E04_DoWhileloop {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner = new Scanner(System.in);
        

        int sayi = 0 ;
        int sayiToplami = 0 ;
        int sayiAdedi = 0 ;

        do {

            System.out.println("Lütfen toplanmak uzere pozitif tam sayi giriniz... "+
                                "\n bitirmek icin 0 a basiniz");
            sayi = scanner.nextInt();

            if (sayi < 0) {//girilen sayi negatifse

                System.out.println("negatif sayi kullanamazsiniz");
            } else if (sayi>0) { //girilen sayi pozitifse

                sayiToplami += sayi;
                sayiAdedi++;
            }
                                    
        } while (sayi != 0);

        System.out.println("Girilen " + sayiAdedi + " adet pozitif sayinin toplami : " + sayiToplami);
    }
}
