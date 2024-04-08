package day19_arrays;

public class E07_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih","Mustafa","Seyfettin","An"};
        enUzunEnKisaKelimeleriYazdir(isimler);
    }

    public static void enUzunEnKisaKelimeleriYazdir(String[] kelimeler){
        String EnUzunKelime = kelimeler[0];
        String EnKisaKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length() > EnUzunKelime.length()) {
                EnUzunKelime = kelimeler[i];
            } else if (kelimeler[i].length() < EnKisaKelime.length()) {
                EnKisaKelime = kelimeler[i];
            }
        }
        System.out.println("En uzun kelime : "+EnUzunKelime);
        System.out.println("En kisa kelime : "+EnKisaKelime);
    }
}
