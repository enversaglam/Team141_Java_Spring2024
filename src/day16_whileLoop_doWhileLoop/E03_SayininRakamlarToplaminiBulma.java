package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class E03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Soru 2- While loop kullanarak
        //         kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlari toplanacak pozitif tamsayiyi giriniz...");
        int sayi = scanner.nextInt();

        int enSondakiRakam = 0;
        int rakamlarToplami = 0;
        int verilenSayi = sayi;

        while ( verilenSayi > 0) {

            enSondakiRakam = verilenSayi % 10;
            rakamlarToplami += enSondakiRakam;
            verilenSayi /= 10;
        }

        System.out.println("Verilen "+sayi+" sayisinin rakamlari toplami : "+rakamlarToplami);
    }
}
