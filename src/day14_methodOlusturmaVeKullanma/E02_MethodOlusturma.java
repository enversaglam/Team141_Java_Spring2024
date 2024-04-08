package day14_methodOlusturmaVeKullanma;

public class E02_MethodOlusturma {
    public static void main(String[] args) {
        // Verilen iki sayidan, buyuk olani yazdiran bir method olusturun
        // eger sayilar esitse, "esit sayilarda buyuk olan yoktur"
        buyukOlaniYazdir(7454, 945);
        buyukOlaniYazdir(7, 9);
        buyukOlaniYazdir(9, 9);
        terstenYazdir("merhaba nasilsin");

    }

    // method class icinde ama diger method'larin disinda olusturulmalidir
    public static void buyukOlaniYazdir(int sayi1, int sayi2) {
        if (sayi1 > sayi2) {
            System.out.println("sayilardan buyuk olan "+sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("sayilardan buyuk olan "+sayi2);
        } else {
            System.out.println("esit olan sayilardan buyuk olan yoktur.");
        }

    }

    public static void terstenYazdir(String metin) {
        for (int i = metin.length()-1; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));
            
        }
    }

    
}
