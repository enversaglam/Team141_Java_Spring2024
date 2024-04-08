package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class E01_faktoryel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 14’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        5 ! = 5 * 4 * 3 * 2 * 1 ==> 120
        Scanner scan = new Scanner(System.in);
        System.out.println("14 te n kücük bir sayi aliniz");
        int sayi = scan.nextInt();

        int faktoryel = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoryel*= i;
            
        }
        System.out.println(faktoryel);
    }
}
