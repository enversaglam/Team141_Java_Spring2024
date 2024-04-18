package day24_ArrayList_ForEachLoop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E03_ArraydekiSayilariToplama {
    
    public static void main(String[] args) {
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
        System.out.println(arrayList);
        System.out.println(Arrays.toString(array));
    }
}
