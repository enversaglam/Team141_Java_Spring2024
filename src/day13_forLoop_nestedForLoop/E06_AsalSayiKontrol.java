package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class E06_AsalSayiKontrol {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scan.nextInt();
        int flag = 20;

        for (int i = 2; i < sayi; i++) {
            if (sayi%i ==0) {
                System.out.println("Verilen sayi "+i+ " ye bölünüyor sayi asal degil");
                flag = 10;
                break;
            }
            
        }
        if (flag == 20){
            System.out.println(sayi +" Sayisi Asaldir");
        }
    }
}
