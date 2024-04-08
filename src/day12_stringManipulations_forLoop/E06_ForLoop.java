package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class E06_ForLoop {
    public static void main(String[] args) {
        // bir kronometre yapin
        // kullanicidan aldiginiz pozitif sayidan
        // 1'e kadar tum sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz . ");
        int sayi = scan.nextInt();

        for (int i = sayi ; i >= 1 ; i--) {
            System.out.print(i + " ");
            
        }
    }
}
