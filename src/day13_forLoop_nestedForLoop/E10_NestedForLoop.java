package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class E10_NestedForLoop {
    public static void main(String[] args) {
        /*
            nested for loop ile asagidaki sekli olusturun

            *
            * *
            * * *
            * * * *
            * * * * *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println("");
            
        }
    }
}
