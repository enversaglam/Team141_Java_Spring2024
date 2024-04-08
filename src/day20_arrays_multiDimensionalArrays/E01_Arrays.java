package day20_arrays_multiDimensionalArrays;

public class E01_Arrays {
    public static void main(String[] args) {
        // verilen int bir array'de
        // verilen min ve max degerler dahil olarak
        // min ve max degerler arasindaki sayilari yazdiran bir method olusturun
        int[] sayilar = {22,45,67,87,12,44,9,5,2,0,11};
        araliktakiSayilariYazdir(sayilar , 4, 9);
        araliktakiSayilariYazdir(sayilar , 33, 70);
        araliktakiSayilariYazdir(sayilar , 22, 50);
    }

    public static void araliktakiSayilariYazdir(int[] arr, int minDeger, int maxDeger) {
        System.out.print(minDeger+" ile "+maxDeger+" arasindaki degerler : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= minDeger && arr[i] <= maxDeger) {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("");
    }
}
