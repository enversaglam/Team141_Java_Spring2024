package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C06_IndirimOdev {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedini giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz...");
        double indirimsizFiyat = scanner.nextDouble();

        double toplamFiyat = urunAdedi*indirimsizFiyat;

        System.out.println("Musteri kartiniz var mi ? E: Evet, H:Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        if (kartVarMi == 'E'){
            if (urunAdedi >10){
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat*80/100);
            } else if (urunAdedi >0){
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat*85/100);
            } else {
                System.out.println("Ürün sayisi olarak pozitif bir tamsayi girmelisiniz");
            }
        } else if (kartVarMi == 'H'){
            if (urunAdedi >10){
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat*85/100);
            } else if (urunAdedi >0){
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat*90/100);
            } else {
                System.out.println("Ürün sayisi olarak pozitif bir tamsayi girmelisiniz");
            }
        } else {
            System.out.println("Kartiniz var mi sorusuna E veya H girmelisiniz");
        }
    }

}