package day11_stringManipulations;

import java.util.Scanner;

public class E02_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Cumle giriniz");

        String cumle = scan.nextLine();

        System.out.println("Lütfen aradiginiz metni giriniz");

        String metin = scan.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex<0){
            System.out.println("aradiginiz metin cumlede yok");
        } else if ((ilkIndex == sonIndex)){
            System.out.println("aradiginiz metin bir kez kullanilmis");
        } else {
            System.out.println("aradiginiz metin birden cok defa kullanilmis");
        }

    }
}
