package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class E05_Split {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";
        System.out.println(Arrays.toString(str.split("at")));
        //[Ali topu , , ,  Ali ]
        System.out.println(Arrays.toString(str.split("Ali")));
        //[,  topu at, at ,  at]

        // str'daki kelime sayisini yazdirin
        // " " ile split yapalim
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println("Kelime Sayisi : "+str.split(" ").length); //6

        // str'i karakterlerine ayirin

        System.out.println(Arrays.toString(str.split("")));
        System.out.println("Karakter sayisi : "+str.split("").length); //22
        //[A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]
    }
}
