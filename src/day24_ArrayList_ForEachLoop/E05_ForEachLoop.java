package day24_ArrayList_ForEachLoop;

public class E05_ForEachLoop {
    public static void main(String[] args) {
        //Soru 2- Verilen int array’deki her elementin karesini alip,
        //        karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {3,2,4,1}; // output 9+4+16+1 => 30
        int[] ssa = {5,6,8,9,9};
        int[] mesela = {6,9,2,3,5,4};
        karelerinToplami(arr); // Array'deki sayilarin kareleri toplami : 30
        karelerinToplami(ssa);
        karelerinToplami(mesela);

    }

    public static void karelerinToplami (int[] sayilar){

        int toplam = 0;
        
        for (int each : sayilar) {
            toplam+= (each*each);
        }
        System.out.println("Array deki sayiların kareleri toplamı : "+toplam);
    }
}
