package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E02_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer[] sayilar = {3,5,2,6,7,3,4,5};

        // Bu array'i list'e cevirin

        // 1- Bir loop ile array'deki tum elementleri list'e ekleyebiliriz
        //    Bir array'i listeye cevirmek icin bu yontem daha saglikli calisir
        List<Integer> sayiList1 = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList1.add(sayilar[i]);
        }
        System.out.println(sayiList1);

        sayiList1.add(9);
        sayiList1.remove(0);
        System.out.println(sayiList1);

        List<Integer> sayiList2 = Arrays.asList(sayilar);
        System.out.println("AsList methodu ile dönüstürülen liste " +sayiList2);
        //sayiList2.add(9);
        //sayiList2.remove(0);

        // 2- AsList()
        /*
            Varolan bir array'i tek bir satirla asList() kullanarak
            listeye cevirebiliriz

            ANCAK bu cevirme islemi ile olusturulan listede 2 major yan etki olur

            - asList() ile donusturulen listeye
              array'de oldugu gibi ekleme veya silme yapamazsiniz

            - asList() ile donusturulen liste ve kaynak olarak kullanilan array
              etkilesime devam eder
              array'de yaptigimiz degisiklikler, listeye de yansir
              ayni sekilde listede yaptigimiz degisiklikler array'e de islenir
         */
        sayilar[0] = 23;
        sayilar[1] = 23;
        
        System.out.println("Array e yapilan atamadan sonra Array     : "+ Arrays.toString(sayilar));
        System.out.println("Array e yapilan atamadan sonra sayiList2 : " +sayiList2);

        //Chat GPT önerisi
        System.out.println("Chat GPT önerisi -----------");

        // Örnek bir dizi
        String[] array = {"Java", "Python", "C++", "JavaScript"};

        // Diziyi bir List'e dönüştürme
        List<String> list = Arrays.asList(array);

        // Elde edilen List'i yazdırma
        System.out.println("List: " + list);

        // İsterseniz List'teki öğeleri değiştirebilirsiniz
        list.set(0, "Ruby");
        System.out.println("Değiştirilmiş List: " + list);

        // Ancak, bu durumda orijinal dizide değişiklikler yapılabilir
        System.out.println("Orijinal Dizi: " + Arrays.toString(array));

        // Eğer değişmez bir List istiyorsanız, ArrayList'e dönüştürebilirsiniz
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        // Şimdi bu ArrayList üzerinde değişiklikler yapılabilir ve orijinal dizi etkilenmez
        arrayList.add("bisey");
        System.out.println("Array List : "+ arrayList);
        System.out.println("Array : "+ Arrays.toString(array));
        array[0] = "Kava";
        System.out.println("Array e ekleme yaptiktan sonraki Array List : "+ arrayList);
        System.out.println("Array e ekleme yaptiktan sonraki Array : "+ Arrays.toString(array));
        System.out.println("Array e ekleme yaptiktan sonraki List : "+ list);
        
    }
}
