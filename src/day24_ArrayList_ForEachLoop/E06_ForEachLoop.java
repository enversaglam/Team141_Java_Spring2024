package day24_ArrayList_ForEachLoop;

import java.util.Scanner;

public class E06_ForEachLoop {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();
        String harf = "";

        while (harf.length()!= 1) {
            System.out.println("Lütfen bir harf girin ..");
            harf = scanner.nextLine();
        }

        String [] harfArrayi = cumle.split("");

        int sayac = 0;

        for (String eachHarf : harfArrayi) {
            if(eachHarf.equalsIgnoreCase(harf)){
                sayac ++;
            }
        }
        if(sayac==0){
            System.out.println(harf+" Harfi "+cumle+" cümlesinde kullanilmamistir");
        } else {
            System.out.println(harf+" Harfi "+cumle+" cümlesinde "+sayac+" kere kullanilmamistir");
        }

    }
}
