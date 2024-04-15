package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class E06_ListEqualsMethodu {
    public static void main(String[] args) {
        // ayni index'lerdeki tum elementler ayni ise true,
        // ayni olmayan varsa false dondurur

        List<Integer> sayilar1 = new ArrayList<>(Arrays.asList(2,6,9));
        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(6,9,2));
        System.out.println(sayilar1.equals(sayilar2));
        Collections.sort(sayilar1);
        Collections.sort(sayilar2);
        System.out.println(sayilar1.equals(sayilar2));
    }
}
