package day12_stringManipulations_forLoop;

public class E05_ForLoop {
    public static void main(String[] args) {
        // iki basamakli pozitif tamsayilarin toplamini yazdirin
        int toplam = 0;
        for (int i = 10; i < 100; i++) {
            toplam += i;
            
        }
        System.out.println("iki basamakli pozitif tamsayilarin toplami : "+toplam);

        // 10 ile 50 arasindaki(sinirlar dahil) 9 ile bolunebilen sayilari toplayin
        // 18, 27, 36, 45
        toplam = 0;
        for (int i = 10; i <= 50; i++) {
            if (i % 9 == 0) {
                toplam += i;
            }
            
        }
        System.out.println("10 ile 50 arasindaki(sinirlar dahil) 9 ile bolunebilen sayilarin toplami : " + toplam);

        // 2 basamakli pozitif ve negatif tum sayilarin toplamini yazdirin

        toplam = 0 ;
        for (int i = -99; i < 100; i++) {
            if ( !(i > -10 && i < 10)) {
                toplam += i;
                //System.out.print( i + " ");
            }
            
        }
        System.out.println("2 basamakli pozitif ve negatif tum sayilarin toplami : "+toplam);
    }
}
