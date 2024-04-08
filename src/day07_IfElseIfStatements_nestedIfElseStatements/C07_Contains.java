package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C07_Contains {
    public static void main(String[] args) {
        String str = "Java Guzeldir";
        System.out.println(str.substring(0, (str.length()-4)));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();

        if (metin.contains("ev") && metin.contains("is")){
            System.out.println("Hayatta denge cok guzel");
        } else if (metin.contains("ev")){
            System.out.println("Home sweet home");
        } else if (metin.contains("is")){
            System.out.println("calismak cok guzel");
        } else {
            System.out.println("tembellik guzel degil");
        }
    }
}