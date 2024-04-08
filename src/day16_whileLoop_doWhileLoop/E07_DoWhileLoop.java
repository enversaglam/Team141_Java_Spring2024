package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class E07_DoWhileLoop {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int karakok =1;
        boolean tamkareMi = false;

        while (karakok*karakok <= sayi) {

            if ( karakok * karakok == sayi) {
                tamkareMi = true;
            }

            karakok++;
        }

        System.out.println(tamkareMi);
        if (tamkareMi == true) {
            System.out.println(sayi+" sayisi "+(karakok -1) +" sayisinin tam karesidir");
        } else {
            System.out.println(sayi+" sayisi hicbir sayinin tam karesi degildir");
        }
    }
}
