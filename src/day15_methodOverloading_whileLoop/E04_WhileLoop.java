package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class E04_WhileLoop {
    public static void main(String[] args) {
        //tekrar sayisi belli olmayan islemleri
        //while loop ile yapmak daha avantajlidir.
        //kullanicidan toplanmak üzere tam sayilar isteyin
        //sayilarin toplami 500 veya daha fazla olursa
        //sayi istmeyi durdurup toplami yazdirin

        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;

        while (toplam < 500) {
            System.out.println("Toplanmak üzere tamsayi giriniz");
            sayi = scanner.nextInt();
            toplam += sayi;

        }

        System.out.println("girdiginiz sayilarin toplami : "+ toplam);
    }
}
