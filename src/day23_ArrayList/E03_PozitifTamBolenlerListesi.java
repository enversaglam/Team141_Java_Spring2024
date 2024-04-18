package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class E03_PozitifTamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Verilen pozitif bir tamsayiyi,
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.
        //        input : 20  return list : {1,2,4,5,10,20}
        System.out.println(pozitifBolenListesi(20));
        System.out.println(pozitifBolenListesi(240));
    }
    public static List<Integer> pozitifBolenListesi (int sayi){
        List<Integer> pozitifBolenlerListesi = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0){
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;
    }
}
