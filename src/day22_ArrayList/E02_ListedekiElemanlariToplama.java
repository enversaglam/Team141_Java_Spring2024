package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E02_ListedekiElemanlariToplama {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(list);

        int toplam = 0;

        for (int i = 0; i < list.size() ; i++) {
            toplam += list.get(i);
        }
        System.out.println(list+" -- Listesindeki sayilarin toplami : "+toplam);
    }
}
