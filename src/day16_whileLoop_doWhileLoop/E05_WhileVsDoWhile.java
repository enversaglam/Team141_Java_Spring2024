package day16_whileLoop_doWhileLoop;

public class E05_WhileVsDoWhile {
    public static void main(String[] args) {
        
        int sayi = 20;

        while (sayi <10) {
            System.out.println("While loop body si calisti");
            sayi--;
        }

        do {
            System.out.println("Do-While loop body si calisti");
            sayi--;
        } while (sayi <10);

        // ilk deger kontol edilmeden once
        // loop body'si bir kere calisir
        // Bu durumda ilk deger uygun olmasa bile
        // Loop body'si 1 kere calismis olur


        // Do-While loop'un +'si da -'si de aynidir
        // kontrol yapilmadan once body bir kere calisir
        // bu ozellik bazen avantaj, bazen de dezavantaj olabilir
    }
}
