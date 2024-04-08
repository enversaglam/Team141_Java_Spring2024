package day19_arrays;

public class E04_TekveCiftUzunluktakiKelimeleriSay {
    public static void main(String[] args) {
        
        // verilen bir String array'deki
        // her bir kelimeyi kontrol edip
        // array'de kac tane tek sayi uzunlugunda,
        // kac tane cift sayi uzunlugunda kelime bulundugunu yazdiran bir method olusturun

        String [] isimler = {"ali", "mehmet", "nazif", "murat"};
        kelimeSayilariniyazdir(isimler);

    }

    public static void kelimeSayilariniyazdir(String[] arr) {

        int tekSayiAdet = 0;
        int ciftSayiAdet = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i].length()%2==0){
                ciftSayiAdet ++;
            } else {
                tekSayiAdet ++;
            }
            
        }
        System.out.println("array de : "+tekSayiAdet+" adet uzunlugu teksayi olan kelime, \n"+
                                ciftSayiAdet+" adet uzunlugu ciftsayi olan kelime var");
    }
}
