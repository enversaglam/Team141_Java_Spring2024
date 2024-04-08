package day21_MultiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class E01_TumElemanlarinToplami {
    public static void main(String[] args) {
        // Verilen iki katli integer bir array'deki
        // tum sayilarin toplamini yazdiran bir method olusturun
        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};
        elemanlarinToplaminiYazdir(arr);

    }

    public static void elemanlarinToplaminiYazdir (int[][] arr){

        // Eger hic bir sart olmaksizin
        // 2 katli array'deki tum elementlere ulasmak isterseniz
        // 2 katli nested bir loop olusturmaliyiz

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
                System.out.print(arr[i][j]+" ");
                
            }
        }
        System.out.print(Arrays.deepToString(arr));
        System.out.println("Verilen array deki sayilarin toplami : "+toplam);
    }
}
