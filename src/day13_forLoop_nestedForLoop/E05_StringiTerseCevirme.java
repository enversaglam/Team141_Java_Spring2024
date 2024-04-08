package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class E05_StringiTerseCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.
        //       Orn :  metin : Java Candir   tersMetin : ridnaC avaJ

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scan.nextLine();
        String tersMetin = "";

        for (int i = metin.length()-1; i>=0; i--) {
            tersMetin += metin.charAt(i);
            
        }
        System.out.println(tersMetin);
    }
}
