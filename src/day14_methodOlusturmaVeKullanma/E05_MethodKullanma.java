package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class E05_MethodKullanma {
    public static void main(String[] args) {

        //Kullanicidan bir metin alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        //Kullanicinin girdigi metni tersten yazdirin.
        C03_MethodOlusturma.terstenYazdir(metin);

        System.out.println(C04_Palindrome.isPalindrome(metin));

        // eger girilen metin palindrome ise "Aferin sana"
        // palindrome degilse "Bu nasil metin, daha guzel bir metin girmelisin " yazdirin

        boolean sonuc = C04_Palindrome.isPalindrome(metin);

        if (sonuc) {//sonuc == true
            System.out.println("Aferin sana");
        } else {
            System.out.println("Bu nasil metin, daha guzel bir metin girmelisin ");
        }
        if (C04_Palindrome.isPalindrome(metin)) { //C04_Palindrome.isPalindrome(metin) == true
            System.out.println("Aferin sana");
        } else {
            System.out.println("Bu nasil metin, daha guzel bir metin girmelisin ");
        }
    }
}
