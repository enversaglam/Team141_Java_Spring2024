package day10_StringManipulations;

import java.util.Scanner;

public class E06_IndexOf {
    public static void main(String[] args) {
        
        String str = "Ali topu at, at Ali at";

        System.out.println(str.indexOf("t")); //4
        System.out.println(str.indexOf('t')); //4

        System.out.println(str.indexOf("Ali")); //0
        System.out.println(str.indexOf("pu at")); //6

        System.out.println(str.indexOf(" ")); //3

        System.out.println(str.indexOf("t", 7)); //10
        //7. index ve sonrasindaki t harfinin indexini verir
        //"u at, at Ali at"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();

        int ilkIndex = metin.indexOf("a"); //1
        System.out.println(metin.indexOf("a", ilkIndex+1));


    }
}
