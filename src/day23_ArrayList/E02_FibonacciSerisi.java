package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class E02_FibonacciSerisi {
    public static void main(String[] args) {
        //Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //        bize ilk n tane tane Fibonacci sayisini
        //        bir list olarak donduren bir method olusturun.
        //       Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233


    }

    public static List<Integer> fibonacciSerisiOlustur (int sayiAdedi) {
        List<Integer> fibonacciSerisi = new ArrayList<>();
        if(sayiAdedi<=0){
            System.out.println("sayi adedi sıfırdan büyük olamalıdır");
        } else if(sayiAdedi == 1){
            fibonacciSerisi.add(0);
        } else if(sayiAdedi == 2){
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }
        return fibonacciSerisi;
    }
}
