package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class E05_SifreOlusturma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean sifreSonuc = false;
        String sifre = "";

        while (!sifreSonuc){ //sifreSonuc == false 
            System.out.println("Lütfen yeni sifre giriniz");
            sifre = scanner.nextLine();

            sifreSonuc = sifreUygunMu(sifre);

        }

        System.out.println("Sifreniz basarili olarak kaydedildi");
        
    }

    public static boolean sifreUygunMu(String sifre){

        int flag = 20;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if ( !Character.isLowerCase(ilkHarf) ){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 15;// hata varsa hep ayni degeri atayacagiz
        }

        //         - son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);
        if ( !(sonHarf>='0' && sonHarf<='9')){

            System.out.println("Son karakter rakam olmali");
            flag = 15;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 15;
        }

        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag = 15;
        }


        // flag kullanarak sonuc yazdirma

        if (flag == 20){
            return true;
        }else {
            return false;
        }

    }
}
