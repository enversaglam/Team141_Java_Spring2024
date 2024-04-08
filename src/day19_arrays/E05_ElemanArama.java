package day19_arrays;

public class E05_ElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {0,4,5,6,4,7,8};
        elemanVarMi(arr, 4);
        elemanVarMi(arr, 8);
    }

    public static void elemanVarMi(int[] arr, int arananSayi) {
        int bulunanAdet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                bulunanAdet ++;
            }
        }
        if (bulunanAdet == 0) {
            System.out.println("aranan "+arananSayi+" sayisi array de yok");
        } else {
            System.out.println("aranan "+arananSayi+" sayisi array de : "+bulunanAdet+" adet kullanilmistir");
        }
    }
}
